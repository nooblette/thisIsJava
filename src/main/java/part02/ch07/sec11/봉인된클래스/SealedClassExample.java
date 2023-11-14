package part02.ch07.sec11.봉인된클래스;

public class SealedClassExample {
	public static void main(String[] args) {
		Person person = new Person(); // 봉인된 클래스는 그 자체로 인스턴스화 할 수 있다.
		Employee employee = new Employee();
		Manager manager = new Manager();
		Director director = new Director();

		person.work();
		employee.work();
		manager.work();
		director.work();
	}
}
