package part03.ch15.sec05.검색기능을강화시킨컬렉션.Comparable;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Person implements Comparable<Person> {
	private String name;
	private int age;

	@Override
	public int compareTo(Person person) {
		if(this.age < person.getAge()) {
			return -1;
		}

		if(this.age > person.getAge()){
			return 1;
		}

		return 0;
	}
}
