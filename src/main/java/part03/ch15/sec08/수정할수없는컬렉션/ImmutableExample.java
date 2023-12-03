package part03.ch15.sec08.수정할수없는컬렉션;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ImmutableExample {
	public static void main(String[] args) {
		// List 불변 컬렉션 생성
		List<String> immutableList = List.of("A", "B", "C");

		// Set 불변 컬렉션 생성
		Set<String> immutableSet = Set.of("A", "B");

		// Map 불변 컬렉션 생성
		Map<Integer, String> integerStringMap = Map.of(
			1, "A",
			2, "B",
			3, "C"
		);

		// Set 컬렉션을 불변 컬렉션으로 복사
		Set<String> mutableSet = new HashSet<>();
		mutableSet.add("A");
		mutableSet.add("B");
		mutableSet.add("C");
		immutableSet = Set.copyOf(mutableSet); // Set 컬렉션을 불변 컬렉션으로 복사

		// 배열로부터 List 불변 컬렉션 생성
		String[] array = {"A", "B", "C"};
		immutableList = Arrays.asList(array);
	}
}
