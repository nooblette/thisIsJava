package part03.ch12.sec11.리플렉션;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionExample {
	public static void main(String[] args) {
		Class clazz = Car.class; // Car 클래스 리플렉션(Car 클래스에 대한 메타 정보 읽어오기)

		System.out.println("[생성자정보]");
		Constructor[] constructors = clazz.getDeclaredConstructors();
		for(Constructor constructor: constructors){
			// 생성자 이름 조회
			System.out.print(constructor.getName());

			// 생성자에 매개변수가 존재할 경우 매개변수 타입 조회
			Class[] parameters = constructor.getParameterTypes();
			System.out.print("(");
			printParameters(parameters);
		}
		System.out.println();

		System.out.println("[필드정보]");
		Field[] fields = clazz.getDeclaredFields();
		for(Field field : fields){
			// 필드 이름 조회
			System.out.print(field.getName());

			// 필드의 타입 조회
			String type = field.getType().getName();

			// 필드 이름 조회
			String name = field.getName();
			System.out.println(type + " " + name);
		}
		System.out.println();

		System.out.println("[메서드정보]");
		Method[] methods = clazz.getDeclaredMethods();
		for(Method method: methods){
			// 메서드 이름 조회
			System.out.print(method.getName());

			// 생성자에 매개변수가 존재할 경우 매개변수 타입 조회
			Class[] parameters = method.getParameterTypes();
			System.out.print("(");
			printParameters(parameters);
		}
		System.out.println();
	}

	private static void printParameters(Class[] parameters) {
		for(int i = 0; i < parameters.length; i++){
			System.out.print(parameters[i].getName());
			if(i < parameters.length-1){
				System.out.print(", ");
			}
		}
		System.out.println(")");
	}
}
