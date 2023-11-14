package part02.ch07.sec10.추상클래스;

public class AbstractMethodExample {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.sound();

		Cat cat = new Cat();
		cat.sound();

		// 매개변수 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}

	public static void animalSound(Animal animal){
		if(animal instanceof Cat cat){
			System.out.println("고양이입니다.");
			cat.sound();
			return;
		}
		animal.sound();
	}
}
