package part04.ch20.sec05.DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionExample {
	public static void main(String[] args) {
		Connection connection = null;

		try {
			// JDBC 인터페이스의 DBMS별 구현 클래스인 JDBC Driver 클래스를 메모리로 로딩
			Class.forName("com.mysql.cj.jdbc.Driver");

			// DB 연결
			connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/this_is_java",
				"java",
				"mysql"
			);

			System.out.println("연결 성공");
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
