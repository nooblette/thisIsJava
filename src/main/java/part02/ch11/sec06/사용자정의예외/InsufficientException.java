package part02.ch11.sec06.사용자정의예외;

public class InsufficientException extends Exception{ // 일반 예외로 선언
	public InsufficientException() {

	}

	public InsufficientException(String message){
		super(message);
	}
}
