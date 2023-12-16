package part04.ch20.sec07.데이터수정;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class BoardUpdateExample {
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

			// 매개변수화된 SQL 문 작성
			String sql = new StringBuilder()
				.append("UPDATE boards SET ")
				.append("btitle=?, ")
				.append("bcontent=?, ")
				.append("bfilename=?, ")
				.append("bfiledata=?")
				.append("WHERE bno = ?")
				.toString();

			// preparedStatement 얻기
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// ? 매개변수에 값 지정
			preparedStatement.setString(1, "눈사람");
			preparedStatement.setString(2, "눈으로 만든 사람");
			preparedStatement.setString(3, "snowman.jpg");
			preparedStatement.setBlob(4, new FileInputStream("src/main/java/part04/ch20/sec07/데이터수정/snowman.jpg"));
			preparedStatement.setInt(5, 3);

			// SQL 문 실행
			int count = preparedStatement.executeUpdate();
			System.out.println("수정된 행의 수 : " + count);

			// preparedStatement 닫기
			preparedStatement.close();
		} catch (Exception e){
			e.printStackTrace();
		} finally {
			if(connection != null) {
				// 연결 끊기
				try {
					connection.close();
				} catch (Exception e){
					e.printStackTrace();
				}
			}
		}
	}
}
