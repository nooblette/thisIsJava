package part04.ch20.sec08.데이터삭제;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BoardDeleteExample {
	public static void main(String[] args) {
		Connection connection = null;
		try {
			// JDBC Driver(= JDBC 인터페이스의 구현 클래스, DBMS 별로 다른 JDBC Driver를 갖는다) 등록
			// Class.forName() : 클래스를 동적으로 JVM 메모리에 로딩한다.
			Class.forName("com.mysql.cj.jdbc.Driver");

			// DB 연결
			connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/this_is_java",
				"java",
				"mysql"
			);

			// 매개변수화된 SQL문 작성
			String sql = "delete from boards where bwriter = ?";

			// PreparedStatement 객체 얻기
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// ? 매개변수에 값 지정
			preparedStatement.setString(1, "winter");

			// sql문 실행
			int rows = preparedStatement.executeUpdate();
			System.out.println("삭제된 행의 수 : " + rows);

			// PreparedStatment 닫기
			preparedStatement.close();
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			// connection 닫기
			if(connection != null){
				try {
					connection.close();
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		}
	}
}
