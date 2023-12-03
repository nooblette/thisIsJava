package part03.ch15.sec03.Set컬렉션.HashSet;

import java.util.Objects;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Member {
	private String name;
	private int age;

	// hashCode() 재정의
	@Override
	public int hashCode(){
		return name.hashCode() + age;
	}

	// equals() 재정의. 이름과 나이가 같으면 true를 반환한다.
	@Override
	public boolean equals(Object object){
		if(object instanceof Member member){
			return this.name.equals(member.name) && this.age == member.age;
		}

		return false;
	}
}
