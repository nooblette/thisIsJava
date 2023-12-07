package part03.ch17.sec04.리소스로부터_스트림얻기;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionStreamExample {
	public static void main(String[] args) {
		List<Product> productList = new ArrayList<>();

		for(int i = 0; i < 5; i++){
			Product product = new Product(i, "상품" + i, "자바컴퍼니", (int)(10000 * Math.random()));
			productList.add(product);
		}

		Stream<Product> productStream = productList.stream();
		productStream.forEach(System.out::println);
	}
}
