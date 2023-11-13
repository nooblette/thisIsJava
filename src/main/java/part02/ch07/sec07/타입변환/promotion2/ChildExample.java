package part02.ch07.sec07.타입변환.promotion2;

public class ChildExample {
	public static void main(String[] args) {
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		System.out.println();


		Parent parent = child; // 자식 클래스를 부모 클래스로 자동타입변환
		parent.method1();
		parent.method2(); // 동일한 Child 인스턴스를 참조하고 있을 경우 오버라이딩된 메서드가 호출된다.
		// parent.method3(); // child 참조 변수가 Child 인스턴스를 참조하고 있더라도, Parent 클래스로 형변환이 되었다면 Parent 클래스의 필드와 메서드만 접근할 수 있다.
	}
}
