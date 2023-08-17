package part02.ch05;

public class LengthExample {
	public static void main(String[] args) {
		String ssn = "9506241230123";
		int length = ssn.length();
		if(length == 13){
			System.out.println("올바른 주민번호");
		} else{
			System.out.println("잘못된 주민번호");
		}
	}
}
