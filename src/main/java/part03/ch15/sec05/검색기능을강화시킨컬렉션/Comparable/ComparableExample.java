package part03.ch15.sec05.검색기능을강화시킨컬렉션.Comparable;

import java.util.TreeSet;

public class ComparableExample {
	public static void main(String[] args) {
		TreeSet<Person> treeSet = new TreeSet<>();

		treeSet.add(new Person("홍길동", 45));
		treeSet.add(new Person("김자바", 25));
		treeSet.add(new Person("박지원", 31));

		for(Person person : treeSet){
			System.out.println(person.getName() + " : " + person.getAge());
		}
	}
}
