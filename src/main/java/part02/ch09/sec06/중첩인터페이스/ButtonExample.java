package part02.ch09.sec06.중첩인터페이스;

public class ButtonExample {
	public static void main(String[] args) {
		// OK 버튼 객체 생성
		Button buttonOK = new Button();

		// OK 버튼을 클릭했을때 이 이벤트를 처리할 ClickListener 구현 클래스(로컬 클래스로 선언)
		class OKListener implements Button.ClickListener {
			@Override
			public void onClick(){
				System.out.println("OK 버튼을 클릭했습니다.");
			}
		}

		// OK 버튼 객체에 OKListener를 주입
		buttonOK.setClickListener(new OKListener());

		// OK 버튼 클릭
		buttonOK.click();

		// Cancel 버튼 객체 생성
		Button buttonCancel = new Button();

		// Cancel 버튼을 클릭했을때 이 이벤트를 처리할 ClickListener 구현 클래스(로컬 클래스로 선언)
		class CancelListener implements Button.ClickListener {
			@Override
			public void onClick(){
				System.out.println("Cancel 버튼을 클릭했습니다.");
			}
		}

		// Cancel 버튼 객체에 CancelListener를 주입
		buttonCancel.setClickListener(new CancelListener());

		// Cancel 버튼 클릭
		// 동일한 click() 메서드를 호출했을지라도, Button 클래스의 ClickListener 인터페이스에 어떤 구현 객체를 세팅하느냐에 따라 실행 결과가 달라진다. -> 다형성
		buttonCancel.click();
	}
}
