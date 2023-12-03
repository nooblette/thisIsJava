package part03.ch15.sec04.Map컬렉션;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		// key, value 객체의 타입으로 각각 String과 Integer를 갖는 Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<>();

		// 객체 저장
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("신용권", 95); // 중복된 key로 저장하는 경우, 나중에 저장한 값으로 value를 대치

		// 키로 값 얻기
		final String name = "신용권";
		System.out.println(name + "의 점수 : " + map.get(name));
		System.out.println();

		// 키 Set 컬렉션을 얻고 반복해서 키와 값 얻기
		Set<String> keySetCollection = map.keySet();
		Iterator<String> keyIterators = keySetCollection.iterator();
		while(keyIterators.hasNext()){
			String nameInWhile = keyIterators.next();
			System.out.println(nameInWhile + "의 점수 : " + map.get(nameInWhile));
		}
		System.out.println();

		// 엔트리 Set 컬렉션을 얻고 반복해서 키와 값 얻기
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Entry<String, Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()){
			Entry<String, Integer> entry = entryIterator.next();
			System.out.println(entry.getKey() + "의 점수 : " + entry.getValue());
		}
		System.out.println();

		// 키로 엔트리 삭제
		map.remove("홍길동");
		System.out.println("총 entry 수 : " + map.size());
	}
}
