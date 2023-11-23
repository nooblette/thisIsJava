package part02.ch11.sec03.예외종류에따른처리;

public class ExceptionHandlingExample2 {
	public static void main(String[] args) {
		String[] array = {"100", "1oo", null, "200"};

		for(int i = 0; i < array.length + 1; i++){
			try{
				int value = Integer.parseInt(array[i]);
				System.out.println("array[" + i + "]: " + value);
			} catch (ArrayIndexOutOfBoundsException e){
				System.out.println("배열 인덱스가 초과됨 " + e.getMessage());
			} catch (NumberFormatException | NullPointerException e){
				System.out.println("숫자로 변환할 수 없음 " + e.getMessage());
			} catch (Throwable e){ // 상위 예외 클래스일수록 나중에 catch 블록을 작성한다.
				System.out.println("최상위 예외 클래스 실행 " + e.getMessage());
			}
		}
	}
}
