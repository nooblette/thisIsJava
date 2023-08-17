package part02.ch05;

public class GarbageObjectExample {
	public static void main(String[] args){
		String hobby = "여행";
		hobby = null; // "여행"에 해당하는 String 객체를 쓰레기 객체로 만듦 -> 이러한 쓰레기 객체는 GC가 처리한다.

		String kind1 = "자동차";
		String kind2 = kind1; // kind1 변수에 저장된 힙 메모리 주소를 kind2변수에 대입
		kind1 = null; // "자동차"에 해당하는 String 객체는 kind2가 참조하고 있기 때문에 쓰레기 객체가 되지 않는다.
		System.out.println("kind2: " + kind2);
	}
}
