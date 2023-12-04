package part03.ch16.sec06.생성자참조;

public class Person {
	public Member getMember1(Creatable1 creatable1){
		return creatable1.create("winter");
	}

	public Member getMember2(Creatable2 creatable2){
		return creatable2.create("winter", "겨울");
	}
}
