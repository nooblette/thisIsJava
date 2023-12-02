package part03.ch14.sec04.스레드이름;

public class ThreadNameExample {
	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread(); // 현재 이 코드를 실행중인 스레드 객체 참조 얻기
		System.out.println(mainThread.getName() + "이 코드를 실행중입니다.");

		for(int i = 0; i < 3; i++){
			// Thread 클래스의 자식 익명 객체를 threadA 변수의 참조로 전달
			Thread threadA = new Thread(){
				@Override
				public void run(){
					System.out.println(getName() + "이 코드를 실행중입니다.");
				}
			};

			threadA.start(); // 쓰레드 실행
		}

		// Thread 클래스의 자식 익명 객체를 chatThread 변수의 참조로 전달
		Thread chatThread = new Thread(){
			@Override
			public void run(){
				System.out.println(getName() + "이 코드를 실행중입니다.");
			}
		};
		chatThread.setName("chat-thread"); // 쓰레드 이름 변경
		chatThread.start(); // 쓰레드 실행
	}
}
