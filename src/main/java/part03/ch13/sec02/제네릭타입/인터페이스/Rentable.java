package part03.ch13.sec02.제네릭타입.인터페이스;

// Rentable 인페이스는 제네릭 타입
public interface Rentable<P> {
	P rent(); // 타입파라미터 P를 리턴 타입으로 사용
}
