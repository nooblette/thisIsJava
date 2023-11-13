package part02.ch07.sec07.타입변환.casting;

public class CastingExample {
	public static void main(String[] args) {
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		System.out.println();

		Parent parent = child;
		parent.method1();
		parent.method2();
		//parent.method3(); // 동일한 Child 인스턴스를 참조하고 있더라도, 자식 클래스에서만 정의된 필드와 메서드는 호출 불가
		System.out.println();

		child = (Child) parent; // 강제 타입 변환(casting)
		child.method3(); // 자식 클래스에서만 선언된 메서드 호출 가능
	}
}
