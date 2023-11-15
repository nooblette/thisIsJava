package part02.ch08.sec12.객체타입확인;

public class InstanceofExample {
	public static void main(String[] args) {
		Taxi taxi = new Taxi();
		Bus bus = new Bus();

		ride(taxi);
		ride(bus);
	}

	private static void ride(Vehicle vehicle){
		if(vehicle instanceof Taxi taxi){
			System.out.println("택시입니다.");
			taxi.run();
			return;
		}
		vehicle.run();
	}
}
