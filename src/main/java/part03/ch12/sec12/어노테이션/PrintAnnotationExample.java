package part03.ch12.sec12.어노테이션;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class PrintAnnotationExample {
	public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
		// 접근제한자 구분 없이 Service Class 에서 정의된 메서드(상속받은 메서드 제외) 반환
		Method[] declaredMethods = Service.class.getDeclaredMethods();
		for(Method method : declaredMethods){
			// 메서드별로 PrintAnnotation.class 어노테이션이 적용되어 있다면 PrintAnnotation.class를 반환, 아니라면 null을 반환
			PrintAnnotation printAnnotation = method.getAnnotation(PrintAnnotation.class);

			// 어노테이션 설정 정보를 이용해서 선 출력
			printLine(printAnnotation);

			// 메서드 호출
			method.invoke(new Service());

			// 설정 정보를 이용해서 선 출력
			printLine(printAnnotation);
		}
	}

	private static void printLine(PrintAnnotation printAnnotation){
		if(printAnnotation == null) {
			return;
		}

		// number 속성 값 얻기
		int number = printAnnotation.number();
		for(int i = 0; i < number; i++){
			// value 속성 값 얻기
			String value = printAnnotation.value();
			System.out.print(value);
		}
		System.out.println();
	}
}
