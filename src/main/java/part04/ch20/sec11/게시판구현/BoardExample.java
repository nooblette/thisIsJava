package part04.ch20.sec11.게시판구현;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BoardExample {
	// Field
	private final Scanner scanner = new Scanner(System.in);
	private Connection connection; // DB 연결을 위함

	// Constructor
	public BoardExample(){
		// JDBC MySQL Driver 등록
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");

			// DB 연결
			this.connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/this_is_java",
				"java",
				"mysql"
			);

		} catch (Exception e){
			e.printStackTrace();
			exit();
		}
	}

	// Method
	public void list() {
		// 타이틀 및 게시물의 컬럼명 출력
		System.out.println();
		System.out.println("[게시물 목록]");
		System.out.println("-------------------------------------");
		System.out.printf("%-6s%-12s%-16s%-40s\n", "no", "writer", "date", "title");
		System.out.println("-------------------------------------");

		// boards 테이블에서 게시물 정보를 가져와서 출력
		try {
			String sql = "" +
				"select bno, btitle, bcontent, bwriter, bdate " +
				"from boards " +
				"order by bno desc";

			// 쿼리 실행을 위해 Connection 객체로부터 PreparedStatment 객체 생성
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// 조회 결과를 ResultSet 객체에 반환
			ResultSet resultSet = preparedStatement.executeQuery();

			// 조회 결과가 n개 이상일 수 있으므로 커서가 데이터가 없는 행을 가리킬때까지(next() 메서드) 조회 반복
			while(resultSet.next()){
				// 조회 결과를 Board 객체에 할당 및 콘솔 출력
				Board board = new Board(
					resultSet.getInt("bno"),
					resultSet.getString("btitle"),
					resultSet.getString("bcontent"),
					resultSet.getString("bwriter"),
					resultSet.getDate("bdate")
				);
				System.out.printf("%-6s%-12s%-16s%-40s\n",
					board.getBno(),
					board.getBwriter(),
					board.getBdate(),
					board.getBtitle()
				);
			}

			// ResultSet 객체 사용 메모리 해제
			resultSet.close();
			preparedStatement.close();
		} catch (SQLException selectSqlException){
			selectSqlException.printStackTrace();
			exit();
		}

		// 메인 메뉴 출력
		mainMenu();
	}

	public void mainMenu(){
		System.out.println();
		System.out.println("-------------------------------------");
		System.out.println("메인 메뉴 : 1. Create | 2. Read | 3. Clear | 4. Exit");
		System.out.print("메뉴 선택 : ");
		System.out.println();

		String menuNo = scanner.nextLine();
		switch (menuNo) {
			case "1" -> create();
			case "2" -> read();
			case "3" -> clear();
			case "4" -> exit();
		}
	}

	private void create() {
		// 입력 받기
		Board board = new Board();
		System.out.println("[새 게시물 입력]");
		System.out.print("제목 : ");
		board.setBtitle(scanner.nextLine());
		System.out.print("내용 : ");
		board.setBcontent(scanner.nextLine());
		System.out.print("작성자 : ");
		board.setBwriter(scanner.nextLine());

		// 보조 메뉴 출력
		System.out.println("-------------------------------------");
		System.out.println("보조 메뉴 : 1. Ok | 2. Cancel");
		System.out.print("메뉴 선택 : ");
		String subMenuNo = scanner.nextLine();

		if("1".equals(subMenuNo)){
			// boards 테이블에 게시물 정보 저장
			try {
				// insert 쿼리 작성
				String sql = "" +
					"insert into boards (btitle, bcontent, bwriter, bdate) " +
					"values (?, ?, ?, now())";

				// 쿼리 실행을 위해 Connection 객체의 prepareStatement 메서드 호출 및 PreparedStatement 객체 반환
				PreparedStatement preparedStatement = connection.prepareStatement(sql);

				// ? 매개변수에 실제 데이터 바인딩
				preparedStatement.setString(1, board.getBtitle());
				preparedStatement.setString(2, board.getBcontent());
				preparedStatement.setString(3, board.getBwriter());

				// 쿼리 실행
				preparedStatement.executeUpdate();

				// preparedStatement 객체의 사용 메모리 해제
				preparedStatement.close();
			} catch (SQLException insertSqlException){
				insertSqlException.printStackTrace();
				exit();
			}

			// 게시물 목록 출력
			list();
		}
	}

	private void read() {
		// 조회 대상 게시물 번호 입력 받기
		System.out.println("[게시물 읽기]");
		System.out.print("bno : ");
		int bno = Integer.parseInt(scanner.nextLine());

		// boards 테이블에서 입력받은 번호에 해당하는 게시물을 가져와 출력
		try {
			// 조회 쿼리 작성
			String sql = "" +
				"select bno, btitle, bcontent, bwriter, bdate " +
				"from boards " +
				"where bno = ?";

			// sql 변수에 작성한 쿼리를 실행하기 위해 Connection 객체의 prepareStatement() 메서드를 호출하여 PreparedStatement 객체 생성
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// ? 매개변수에 조회 조건 바인딩
			preparedStatement.setInt(1, bno);

			// 조회 쿼리 실행 및 결과를 ResultSet 객체에 매핑
			ResultSet resultSet = preparedStatement.executeQuery();

			// bno 컬럼은 boards 테이블의 기본키이므로 조회 결과는 반드시 한 건임이 보장된다.
			if(resultSet.next()){ // 최초 커서가 위치에서(beforeFirst) 다음 행이 실제로 데이터가 있다면 조회 로직 실행
				Board board = new Board(
					resultSet.getInt("bno"),
					resultSet.getString("btitle"),
					resultSet.getString("bcontent"),
					resultSet.getString("bwriter"),
					resultSet.getDate("bdate")
				);

				// 조회 결과 콘솔 출력
				System.out.println("#############");
				System.out.println("번호 : " + board.getBno());
				System.out.println("제목 : " + board.getBtitle());
				System.out.println("내용 : " + board.getBcontent());
				System.out.println("작성자 : " + board.getBwriter());
				System.out.println("날짜 : " + board.getBdate());
				System.out.println("#############");

				// 보조 메뉴 출력
				System.out.println("-------------------------------------");
				System.out.println("보조 메뉴 : 1. Update | 2. Delete | 3. List");
				System.out.print("메뉴 선택 : ");
				String subMenuNo = scanner.nextLine();
				System.out.println();

				if("1".equals(subMenuNo)){
					update(board);
				} else if ("2".equals(subMenuNo)){
					delete(board);
				}

				// ResultSet 객체 사용 메모리 해제
				resultSet.close();

				// PreparedStatement 객체 사용 메모리 해제
				preparedStatement.close();
			}
		} catch (SQLException selectByBnoSqlException) {
			selectByBnoSqlException.printStackTrace();
			exit();
		}

		// 게시물 목록 출력
		list();
	}

	private void update(Board board){
		// 수정 내용 입력 받기
		System.out.println("[수정 내용 입력]");
		System.out.print("제목 : ");
		board.setBtitle(scanner.nextLine());
		System.out.println("내용 : ");
		board.setBcontent(scanner.nextLine());
		System.out.println("작성자 : ");
		board.setBwriter(scanner.nextLine());

		// 보조 메뉴 출력
		System.out.println("-------------------------------------");
		System.out.println("보조 메뉴 : 1. Ok | 2. Cancel");
		System.out.print("메뉴 선택 : ");
		String subMenuNo = scanner.nextLine();
		System.out.println();

		// 1. Ok를 선택했을 경우 boards 테이블로 수정사항을 업데이트(update 쿼리 실행)
		if("1".equals(subMenuNo)){
			try {
				String sql = "" +
					"update boards set btitle = ?, bcontent = ?, bwriter = ? " +
					"where bno = ? ";

				// 쿼리 실행을 위한 PreparedStatement 객체 생성 및 ?에 매개값 세팅
				PreparedStatement preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, board.getBtitle());
				preparedStatement.setString(2, board.getBcontent());
				preparedStatement.setString(3, board.getBwriter());
				preparedStatement.setInt(4, board.getBno());

				// 쿼리 실행
				preparedStatement.executeUpdate();

				// PreparedStatement 객체 사용 메모리 해제
				preparedStatement.close();
			} catch (SQLException updateSqlException){
				updateSqlException.printStackTrace();
				exit();
			}

			// 게시물 목록 출력
			list();
		}
	}

	private void delete(Board board){
		// boards 테이블에 게시물 정보 삭제
		try {
			// 삭제 쿼리
			String sql = "delete from boards where bno = ?";

			// 쿼리 실행을 위한 PreparedStatement 객체 생성
			PreparedStatement preparedStatement = connection.prepareStatement(sql);

			// ? 파라미터에 매개값 바인딩
			preparedStatement.setInt(1, board.getBno());

			// 쿼리 실행
			preparedStatement.executeUpdate();

			// PreparedStatement 객체가 사용중인 메모리 해제
			preparedStatement.close();
		} catch (SQLException deleteSqlException){
			deleteSqlException.printStackTrace();
			exit();
		}

		// 게시물 목록 출력
		list();
	}

	private void clear() {
		System.out.println("[게시물 전체 삭제]");
		System.out.println("-------------------------------------");
		System.out.println("보조 메뉴 : 1. Ok | 2. Cancel");
		System.out.print("메뉴 선택 : ");
		String subMenuNo = scanner.nextLine();

		if("1".equals((subMenuNo))){
			// boards 테이블에 게시물 정보 전체 삭제
			try {
				String sql = "truncate table boards";

				// 쿼리 실행을 위한 PreparedStatement 객체 생성
				PreparedStatement preparedStatement = connection.prepareStatement(sql);

				// 쿼리 실행
				preparedStatement.executeUpdate();

				// PreparedStatement 객체가 사용중인 메모리 해제
				preparedStatement.close();
			} catch (SQLException deleteAllSqlException){
				deleteAllSqlException.printStackTrace();
				exit();
			}
		}

		// 게시물 목록 출력
		list();
	}

	private void exit() {
		if(connection != null) {
			try {
				connection.close();
			} catch (SQLException exitException){
				exitException.printStackTrace();
			}
		}
		System.out.println("*** 게시판 종료 ***");
		System.exit(0);
	}

	public static void main(String[] args) {
		// BoardExample1 객체 생성 및 인스턴스 메서드(list()) 호출
		BoardExample boardExample1 = new BoardExample();
		boardExample1.list();
	}
}
