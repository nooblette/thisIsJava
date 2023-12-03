package part03.ch15.sec05.검색기능을강화시킨컬렉션.TreeMap;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		// TreeMap 컬렉션 생성
		TreeMap<String, Integer> treeMap = new TreeMap<>();

		// 무작위로 Map.Entry 저장
		treeMap.put("apple", 10);
		treeMap.put("forever", 60);
		treeMap.put("description", 40);
		treeMap.put("ever", 50);
		treeMap.put("zoo", 80);
		treeMap.put("base", 20);
		treeMap.put("guess", 70);
		treeMap.put("cherry", 30);

		// 정렬된 엔트리를 하나씩 가져오기
		Set<Entry<String, Integer>> entrySet = treeMap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
		System.out.println();

		// 제일 앞단어 가져오기
		Entry<String, Integer> firstEntry = treeMap.firstEntry();
		System.out.println(firstEntry.getKey() + "-" + firstEntry.getValue());

		// 제일 마지막 단어 가져오기
		Entry<String, Integer> lastEntry = treeMap.lastEntry();
		System.out.println(lastEntry.getKey() + "-" + lastEntry.getValue());

		// ever 바로 앞 단어
		Entry<String, Integer> aEntry = treeMap.lowerEntry("ever");
		System.out.println(aEntry.getKey() + "-" + aEntry.getValue());
		System.out.println();

		// 내림차순 정렬
		NavigableMap<String, Integer> descendingMap = treeMap.descendingMap();
		Set<Entry<String, Integer>> entries = descendingMap.entrySet();
		for (Entry<String, Integer> entry : entries) {
			System.out.println(entry.getKey() + "-" + entry.getValue());
		}
		System.out.println();

		// 범위 검색
		System.out.println("c와 h 사이의 단어 검색");
		NavigableMap<String, Integer> navigableMap = treeMap.subMap("c", true, "h", true);
		Set<Entry<String, Integer>> set = navigableMap.entrySet(); // Map의 엔트리 객체를 Set 타입으로 반환
		Iterator<Entry<String, Integer>> iterator = set.iterator();
		while(iterator.hasNext()){
			Entry<String, Integer> entry = iterator.next();
			System.out.println(entry.getKey() + "-" + entry.getValue());

		}
	}
}
