package part04.ch20.sec06.데이터저장;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BoardInsertExample {
	public static void main(String[] args) {
		Connection connection = null;

		try {
			// JDBC 인터페이스의 DBMS별 구현 클래스인 JDBC Driver 클래스를 메모리로 로딩 (JDBC Driver 등록)
			Class.forName("com.mysql.cj.jdbc.Driver");

			// DB 연결
			connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/this_is_java",
				"java",
				"mysql"
			);

			System.out.println("연결 성공");

			// 매개변수화된 SQL문 작성
			String sql = "" +
				"insert into boards (btitle, bcontent, bwriter, bdate, bfilename, bfiledata)" +
				"values (?, ?, ?, now(), ?, ?)";

			// Connection 클래스의 prepareStament() 메서드를 호출하여 매개변수화된 SQL문을 실행하기 위한 preparedStatement 객체를 반환
			PreparedStatement preparedStatement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

			// ? 매개변수에 값 세팅
			preparedStatement.setString(1, "눈 오는 날");
			preparedStatement.setString(2, "함박눈이 내려요");
			preparedStatement.setString(3, "winter");
			preparedStatement.setString(4, "snow.jpg");
			preparedStatement.setBlob(5, new FileInputStream("src/main/java/part04/ch20/sec06/데이터저장/snow.jpg"));

			// SQL문 실행
			int rows = preparedStatement.executeUpdate();
			System.out.println("저장된 행의 수 : " + rows);

			// INSERT 쿼리를 실행한 후 저장된 bno 값을 출력
			if(rows == 1){
				//  DB로부터 실행한 결과를 ResultSet 객체에 담는다
				ResultSet resultSet = preparedStatement.getGeneratedKeys();

				if(resultSet.next()){
					int bno = resultSet.getInt(1); // 첫번째 항목의 값을 반환
					System.out.println("저장된 bno 컬럼 값 : " + bno);
				}

				// ResultSet이 사용하던 메모리 해제
				resultSet.close();
			}
			// PreparedStatement 메모리 해제
			preparedStatement.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(connection != null) {
				try {
					// 연결 해제
					connection.close();
					System.out.println("연결 해제");
				} catch (SQLException e){
					e.printStackTrace();
				}
			}
		}
	}
}
