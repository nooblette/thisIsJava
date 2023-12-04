package part03.ch16.sec05.메서드참조.정적메서드와_인스턴스메서드참조;

public class Person {
	public void action(Calculable calculable){
		System.out.println("결과 : " + calculable.calc(10, 4));
	}
}
