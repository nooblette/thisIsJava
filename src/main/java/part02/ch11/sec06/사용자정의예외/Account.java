package part02.ch11.sec06.사용자정의예외;

public class Account {
	private long balance;

	public Account() {}

	public long getBalance(){
		return balance;
	}

	public void deposit(int money){
		balance += money;
	}

	public void withdraw(int money) throws InsufficientException{
		if(balance < money){
			throw new InsufficientException("잔고 " + (money-balance) + "원 부족 ");
		}
		balance -= money;
	}
}
