package part02.ch07.sec07.타입변환.cat;

public class CatExample {
	public static void main(String[] args) {
		Cat cat = new Cat();
		Animal animal = cat;

		System.out.println(cat == animal);
		System.out.println(cat);
		System.out.println(animal);
	}
}
