package part03.ch16.sec04.리턴값이있는람다식;

public class Person {
	public void action(Calculable calculable){
		System.out.println("결과 : " + calculable.calc(10, 4));
	}
}
