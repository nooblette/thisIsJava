package part04.ch20.sec09.데이터읽기.사용자정보읽기;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserSelectExample {
	public static void main(String[] args) {
		Connection connection = null;
		try {
			// JDBC Driver 등록
			Class.forName("com.mysql.cj.jdbc.Driver");

			// DB 연결
			connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/this_is_java",
				"java",
				"mysql"
			);

			// 매개변수화된 sql 문 작성
			String sql = ""
				+ "SELECT userid, username, userpassword, userage, useremail "
				+ "FROM users "
				+ "WHERE userid = ?";

			// 매개변수화된 sql 문을 실행하기 위해 Connection 객체로부터 prepareStatment() 메서드를 호출하여 PreparedStatement 객체를 반환
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// ? 매개변수에 값 지정
			preparedStatement.setString(1, "winter");

			// PreparedStatment의 executeQuery() 메서드를 호출하여 조회 쿼리 실행 및 그 결과를 ReulstSet으로 반환
			ResultSet resultSet = preparedStatement.executeQuery();

			// 조회 결과에 따른 적절한 처리 진행
			if(resultSet.next()){
				User user = new User();
				user.setUserId(resultSet.getString("userid"));
				user.setUserName(resultSet.getString("username"));
				user.setUserPassword(resultSet.getString("userpassword"));
				user.setUserAge(resultSet.getInt("userage"));
				user.setUserEmail(resultSet.getString("useremail"));
				System.out.println(user);
			} else {
				System.out.println("사용자 아이디가 존재하지 않음");
			}

			resultSet.close();
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
