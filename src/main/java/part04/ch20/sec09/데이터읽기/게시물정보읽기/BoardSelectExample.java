package part04.ch20.sec09.데이터읽기.사용자정보읽기;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import part04.ch20.sec09.데이터읽기.게시물정보읽기.Board;

public class BoardSelectExample {
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
				+ "select bno, btitle, bcontent, bwriter, bdate, bfilename, bfiledata "
				+ "from boards "
				+ "where bwriter = ?";

			// 매개변수화된 sql 문을 실행하기 위해 Connection 객체로부터 prepareStatment() 메서드를 호출하여 PreparedStatement 객체를 반환
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// ? 매개변수에 값 지정
			preparedStatement.setString(1, "winter");

			// PreparedStatment의 executeQuery() 메서드를 호출하여 조회 쿼리 실행 및 그 결과를 ReulstSet으로 반환
			ResultSet resultSet = preparedStatement.executeQuery();

			// 조회 결과에 따른 적절한 처리 진행
			while(resultSet.next()){
				// 데이터 행을 읽고 Board 객체에 저장
				Board board = new Board();
				board.setBno(resultSet.getInt("bno"));
				board.setBtitle(resultSet.getString("btitle"));
				board.setBcontent(resultSet.getString("bcontent"));
				board.setBwriter(resultSet.getString("bwriter"));
				board.setBdate(resultSet.getDate("bdate"));
				board.setBfilename(resultSet.getString("bfilename"));
				board.setBfiledata(resultSet.getBlob("bfiledata"));

				// 콘솔에 출력
				System.out.println(board);

				// bfiledata 값은 파일로 저장
				Blob blob = board.getBfiledata();
				if(blob != null) {
					InputStream inputStream = blob.getBinaryStream();
					OutputStream outputStream = new FileOutputStream("src/main/java/part04/ch20/sec09/데이터읽기/게시물정보읽기/" + board.getBfilename());
					inputStream.transferTo(outputStream); // 파일 복사
					outputStream.flush();
					outputStream.close();
					inputStream.close();
				}
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
