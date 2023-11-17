package part02.ch09.sec06.중첩인터페이스;

public class Button {
	// 정적 중첩 인터페이스
	public static interface ClickListener{
		// 인터페이스의 추상 메서드
		void onClick();
	}

	// 인스턴스 필드
	private ClickListener clickListener;

	// 인스턴스 메서드
	public void setClickListener(ClickListener clickListener){
		this.clickListener = clickListener;
	}

	// Button이 클릭되었을 때 실행할 메서드
	public void click() {
		// Button Click 이벤트가 발생하면 중첩 인터페이스의 onClick() 메서드를 호출한다.
		this.clickListener.onClick();
	}
}
