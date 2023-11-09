package part02.ch06.sec14.Getter_Setter;

public class Car {
	private double speed; // 자동차의 속력은 필드 접근을 막는다. (private)

	public void setSpeed(double speed) { // 대신 메서드를 통해 간접적으로 필드에 접근한다.
		if(speed < 0) {
			this.speed = 0;
			return;
		}
		this.speed = speed;
	}

	public double getSpeed() { // 대신 메서드를 통해 간접적으로 필드에 접근한다.
		return this.speed;
	}

	public boolean isStop(){
		return this.speed <= 0;
	}
}