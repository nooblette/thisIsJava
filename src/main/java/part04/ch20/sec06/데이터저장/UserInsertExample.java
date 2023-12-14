package part04.ch20.sec06.데이터저장;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserInsertExample {
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
			String sql = new StringBuilder()
				.append("insert into users (userid, username, userpassword, userage, useremail)")
				.append("values (?, ?, ?, ?, ?)")
				.toString();

			// sql 변수에 작성된 쿼리를 실행하기 위한 connection 객체로부터 PreparedStatement 객체 반환
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// ? 매개변수에 값 세팅, 몇 번째 ?에 세팅하는 값인지 순서를 함께 지정한다.
			preparedStatement.setString(1, "winter"); // 첫번쨰 ? 매개변수에 'winter' 값을 지정
			preparedStatement.setString(2, "한겨울");
			preparedStatement.setString(3, "12345");
			preparedStatement.setInt(4, 25);
			preparedStatement.setString(5, "winter@mycompany.com");

			// SQL문 실행
			int rows = preparedStatement.executeUpdate();
			System.out.println("저장된 행의 수 : " + rows);

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
