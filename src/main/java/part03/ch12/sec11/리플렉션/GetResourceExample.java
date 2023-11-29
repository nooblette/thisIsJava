package part03.ch12.sec11.리플렉션;

public class GetResourceExample {
	public static void main(String[] args) {
		Class clazz = Car.class;

		String photo1Path = clazz.getResource("/photo1.jpg").getPath(); // getPath : photo01.jpg URL 객체의 절대경로를 반환
		String photo2Path = clazz.getResource("/images/photo2.jpg").getPath(); // getPath : images/photo2.jpg URL 객체의 절대경로를 반환

		System.out.println("photo1 absolute path : " + photo1Path);
		System.out.println("photo2 absolute path : " + photo2Path);

	}
}
