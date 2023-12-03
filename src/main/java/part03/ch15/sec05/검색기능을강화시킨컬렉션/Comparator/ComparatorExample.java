package part03.ch15.sec05.검색기능을강화시킨컬렉션.Comparator;

import java.util.TreeSet;

public class ComparatorExample {
	public static void main(String[] args) {
		// TreeSet 컬렉션 객체 생성시 비교자 FruitComparator를 생성자의 매개변수로 전달
		TreeSet<Fruit> treeSet = new TreeSet<>(new FruitComparator());

		treeSet.add(new Fruit("포도", 3000));
		treeSet.add(new Fruit("수박", 10000));
		treeSet.add(new Fruit("딸기", 6000));

		for(Fruit fruit : treeSet){
			System.out.println(fruit.getName() + " : " + fruit.getPrice());
		}
	}
}
