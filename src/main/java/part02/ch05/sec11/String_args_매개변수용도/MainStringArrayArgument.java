package part02.ch05.sec11.String_args_매개변수용도;

public class MainStringArrayArgument {
	public static void main(String[] args) {
		if(args.length != 2){
			System.out.println("잘못된 프로그램 입력 값");
			System.exit(0); // 프로그램 강제 종료
		}

		System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
	}
}
