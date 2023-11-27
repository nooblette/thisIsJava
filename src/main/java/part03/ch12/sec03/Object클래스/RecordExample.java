package part03.ch12.sec03.Object클래스;

public class RecordExample {
	public static void main(String[] args) {
		MemberRecord member = new MemberRecord("1", "이자바", 25);

		System.out.println(member.id());
		System.out.println(member.name());
		System.out.println(member.age());

		System.out.println(member.hashCode());
		System.out.println(member.toString());

		MemberRecord member2 = new MemberRecord("1", "이자바", 25);
		System.out.println(member2.hashCode());
		System.out.println(member.equals(member2));
	}
}
