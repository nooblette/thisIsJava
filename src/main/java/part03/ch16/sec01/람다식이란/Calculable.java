package part03.ch16.sec01.람다식이란;

@FunctionalInterface
public interface Calculable {
	// 단 하나의 추상 메서드만을 제공
	void calculate(int x, int y);
}
