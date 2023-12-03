package part03.ch15.sec05.검색기능을강화시킨컬렉션.Comparator;

import java.util.Comparator;

public class FruitComparator implements Comparator<Fruit> {
	@Override
	public int compare(Fruit o1, Fruit o2) {
		if(o1.getPrice() < o2.getPrice()) {
			return -1;
		}
		if(o1.getPrice() > o2.getPrice()){
			return 1;
		}
		return 0;
	}
}
