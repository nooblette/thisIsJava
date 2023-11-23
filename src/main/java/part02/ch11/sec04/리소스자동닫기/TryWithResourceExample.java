package part02.ch11.sec04.리소스자동닫기;

public class TryWithResourceExample {
	public static void main(String[] args) {
		try(MyResource myResource = new MyResource("A")) {
			String data = myResource.read1();
			int value = Integer.parseInt(data);
		} catch (Exception e){
			System.out.println("예외 처리: " + e.getMessage());
		}

		System.out.println();
		try(MyResource myResource = new MyResource("B")) {
			String data = myResource.read2();
			int value = Integer.parseInt(data);
		} catch (Exception e){
			System.out.println("예외 처리: " + e.getMessage());
		}

		System.out.println();
		try(
			MyResource myResource1 = new MyResource("A");
			MyResource myResource2 = new MyResource("B")) {
			String data = myResource1.read1();
			int value = Integer.parseInt(data);

			data = myResource2.read1();
			value = Integer.parseInt(data);
		} catch (Exception e){
			System.out.println("예외 처리: " + e.getMessage());
		}

		// Java 9 부터 가능
		System.out.println();
		MyResource myResource1 = new MyResource("A");
		MyResource myResource2 = new MyResource("B");
		try(myResource1; myResource2) {
			String data = myResource1.read1();
			int value = Integer.parseInt(data);

			data = myResource2.read1();
			value = Integer.parseInt(data);
		} catch (Exception e){
			System.out.println("예외 처리: " + e.getMessage());
		}
	}
}
