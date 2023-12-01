package part03.ch13.sec02.제네릭타입.클래스;

public class Product<K, M> { // 제네릭 타입
	// Product 클래스의 필드의 타입은 다양한 종류와 모델 제품을 저장하기 타입 파라미터(K, M)로 선언한다.
	// Product 클래스 선언시에 정확히 어떤 종류와 모델을 저장할지 모르지만 Product 객체 생성시 구체적인 타입으로 대체된다.
	private K kind;
	private M model;

	// Product 클래스의 메서드인 Getter()의 리턴타입과 Setter()의 매개변수 역시 타입 파라미터로 선언한다.
	public K getKind(){
		return kind;
	}
	public M getModel(){
		return model;
	}
	public void setKind(K kind){
		this.kind = kind;
	}
	public void setModel(M model){
		this.model = model;
	}
}
