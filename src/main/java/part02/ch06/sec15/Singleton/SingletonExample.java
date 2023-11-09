package part02.ch06.sec15.Singleton;

public class SingletonExample {
	public static void main(String[] args) {
		//Singleton singleton1 = new Singleton(); // new 메서드로 객체 생성 불가(생성자가 private 접근 제한을 가지고 있기 때문)

		Singleton singleton1 = Singleton.getInstance();
		Singleton singleton2 = Singleton.getInstance();

		System.out.println(singleton1.toString());
		System.out.println(singleton2.toString());

		// 동일한 객체를 참조하는지 확인
		if(singleton1 == singleton2) {
			System.out.println("같은 singleton 객체를 참조합니다.");
		} else{
			System.out.println("다른 singleton 객체를 참조합니다.");
		}
	}
}
