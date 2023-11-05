package part02.ch05.sec6.배열타입;

public class ArrayCreateByNewExample {
	public static void main(String[] args) {
		int[] arr1 = new int[3];
		System.out.println("============== int arr ==============");
		for(int i = 0; i < arr1.length; i++){
			System.out.println("arr1[" + i + "]: " + arr1[i]);
		}

		arr1[0] = 1;
		for(int i = 0; i < arr1.length; i++){
			System.out.println("arr1[" + i + "]: " + arr1[i]);
		}

		System.out.println("============== double arr ==============");
		double[] arr2 = new double[3];
		for(int i = 0; i < arr2.length; i++){
			System.out.println("arr2[" + i + "]: " + arr2[i]);
		}

		arr2[0] = 1.0;
		for(int i = 0; i < arr2.length; i++){
			System.out.println("arr2[" + i + "]: " + arr2[i]);
		}

		System.out.println("============== String arr ==============");
		String[] arr3 = new String[3];
		for(int i = 0; i < arr3.length; i++){
			System.out.println("arr3[" + i + "]: " + arr3[i]);
		}

		arr3[0] = "java";
		for(int i = 0; i < arr3.length; i++){
			System.out.println("arr3[" + i + "]: " + arr3[i]);
		}

	}
}
