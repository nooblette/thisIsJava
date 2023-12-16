package part04.ch20.sec10.트랜잭션처리;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionExample {
	public static void main(String[] args) {
		Connection connection = null;
		try {
			// mysql JDBC Driver 메모리 등록
			Class.forName("com.mysql.cj.jdbc.Driver");

			// DB 연결
			connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/this_is_java",
				"java",
				"mysql"
			);

			/* 트랜잭션 시작 */

			// 자동 커밋(auto commit) 기능 해제
			connection.setAutoCommit(false);

			// 출금 작업
			String withdrawal = "UPDATE accounts SET balance = balance - ? WHERE ano = ?";
			PreparedStatement withDrawalPreparedStatement = connection.prepareStatement(withdrawal);
			withDrawalPreparedStatement.setInt(1, 10000); // 10000원 출금
			withDrawalPreparedStatement.setString(2, "111-111-1111");
			int withdrawalResultCount = withDrawalPreparedStatement.executeUpdate();
			if(withdrawalResultCount == 0) {
				throw new Exception("출금 실패");
			}
			withDrawalPreparedStatement.close();

			// 입금 작업
			String deposit = "UPDATE accounts SET balance = balance + ? WHERE ano = ?";
			PreparedStatement depositPreparedStatement = connection.prepareStatement(deposit);
			depositPreparedStatement.setInt(1, 10000);
			depositPreparedStatement.setString(2, "222-222-2222");
			int depositResultCount = depositPreparedStatement.executeUpdate();
			if(depositResultCount == 0) {
				throw new Exception("입금 실패");
			}
			depositPreparedStatement.close();

			// 수동 커밋 -> 모든 소작업 성공 처리
			connection.commit();

			/* 트랜잭션 종료*/
			System.out.println("계좌 이체 성공");

		} catch (Exception exception){
			exception.printStackTrace();

			// 수동 롤백 -> 모든 소작업 실패 처리
			try {
				connection.rollback();
			} catch (SQLException sqlException){
				sqlException.printStackTrace();
			}
			System.out.println("계좌 이체 실패");
		} finally {
			if(connection != null) {
				try {
					// 자동 커밋 기능 원복
					connection.setAutoCommit(true);

					// DB 연결 해제
					connection.close();
				} catch (SQLException sqlException2) {
					sqlException2.printStackTrace();
				}
			}
		}
	}
}
