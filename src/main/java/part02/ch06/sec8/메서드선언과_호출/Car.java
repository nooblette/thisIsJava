package part02.ch06.sec8.메서드선언과_호출;

public class Car {
	int gas;

	void setGas(int gas){
		this.gas = gas;
	}

	boolean isLeftGas(){
		if(this.gas == 0){
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	}

	void run(){
		while (true){
			if(gas > 0) {
				System.out.println("달립니다. gas 잔량 : " + gas);
				gas--;
			} else {
				System.out.println("멈춥니다. gas 잔량 : " + gas);
				return;
			}
		}
	}

}