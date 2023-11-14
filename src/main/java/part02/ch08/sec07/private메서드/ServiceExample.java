package part02.ch08.sec07.private메서드;

public class ServiceExample {
	public static void main(String[] args) {
		Service service = new ServiceImpl();

		// 디폴트 메서드 호출
		service.defaultMethod1();
		service.defaultMethod2();

		// 정적 메서드 호출
		Service.defaultStaticMethod1();
		Service.defaultStaticMethod2();
	}
}
