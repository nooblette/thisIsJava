package part03.ch12.sec03.Object클래스;

public class LombokExample {
	public static void main(String[] args) {
		MemberLombok member = new MemberLombok("1", "이자바", 25);

		System.out.println(member.getId());
		System.out.println(member.getName());
		System.out.println(member.getAge());

		System.out.println(member.hashCode());
		System.out.println(member.toString());

		MemberRecord member2 = new MemberRecord("1", "이자바", 25);
		System.out.println(member2.hashCode());
		System.out.println(member.equals(member2));
	}
}
