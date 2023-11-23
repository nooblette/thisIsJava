package part02.ch11.sec06.사용자정의예외;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();

		// 예금
		account.deposit(10000);
		System.out.println("현재 예금액 : " + account.getBalance());

		// 출굼
		try{
			account.withdraw(13000);
		} catch (InsufficientException e){
			e.printStackTrace();
		}
		System.out.println("현재 예금액 : " + account.getBalance());

	}
}
