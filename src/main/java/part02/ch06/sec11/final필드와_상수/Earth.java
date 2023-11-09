package part02.ch06.sec11.final필드와_상수;

public class Earth {
	// 상수 선언 및 초기화
	static final double EARTH_RADIUS = 6400;

	// 상수 선언
	static final double EARTH_SURFACE_AREA;

	// 정적 블록에서 상수 초기화
	static {
		// PI 또한 Math 클래스에서 제공하는 상수
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS;
	}
}
