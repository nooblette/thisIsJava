package part03.ch16.sec06.생성자참조;

public class ConstructorExample {
	public static void main(String[] args) {
		Person person = new Person();

		// Creatable1 인터페이스의 추상 메서드 create를 정의하는 익명 구현 객체 전달
		person.getMember1(new Creatable1(){
			@Override
			public Member create(String id){
				System.out.println("익명 구현 객체 직접 정의");
				return new Member(id);
			}
		});
		System.out.println();

		// 익명구현객체 대신 람다식으로 전달
		person.getMember1(id -> {
			System.out.println("람다식으로 생성자 호출");
			return new Member(id);
		});
		System.out.println();

		// return과 new 키워드 생략(실행문이 한줄)
		System.out.println("람다식의 실행문을 한줄로 작성");
		person.getMember1(id -> new Member(id));


		// (), ->, {} 기호를 :: 와 new 키워드로 대체
		System.out.println("(), ->, {} 기호를 :: 와 new 키워드로 대체하여 작성");
		Member m1 = person.getMember1(Member::new);

		System.out.println(m1);
		System.out.println();

		Member m2 = person.getMember2(Member::new);
		System.out.println(m2);
	}
}
