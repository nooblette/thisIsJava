package part03.ch15.sec03.Set컬렉션.Iterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetIteratorExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();

		// 객체 추가
		set.add("java");
		set.add("JDBC");
		set.add("JSP");
		set.add("Spring");

		// 객체를 하나씩 순차적으로 순회
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()){
			String string = iterator.next();
			System.out.println(string);

			// JSP 문자열은 제거
			if("JSP".equals(string)){
				iterator.remove();
			}
		}
		System.out.println();

		// 객체 제거
		set.remove("JDBC");

		// 객체를 하나씩 가져와서 출력
		for(String str : set){
			System.out.println(str);
		}
	}
}
