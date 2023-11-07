package part02.ch06.sec8.메서드선언과_호출;

public class Calculator {
	void powerOn(){
		System.out.println("전원 시작");
	}

	void powerOff(){
		System.out.println("전원 종료");
	}

	int plus(int x, int y){
		return x+y;
	}

	double areaRectangle(double width){
		return width * width;
	}

	double areaRectangle(double width, double height){
		return width * height;
	}

	double divide(int x, int y){
		return (double)x / y;
	}
}
