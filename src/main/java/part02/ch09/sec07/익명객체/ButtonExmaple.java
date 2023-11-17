package part02.ch09.sec07.익명객체;

import part02.ch09.sec06.중첩인터페이스.Button;

public class ButtonExmaple {
	public static void main(String[] args) {
		// 중첩 인터페이스 예제를 익명 구현 객체로 수정

		// OK 버튼 객체 생성
		Button buttonOK = new Button();

		// OK 버튼 객체에 익명 구현 객체로 OKListener를 주입
		buttonOK.setClickListener(new Button.ClickListener() {
			@Override
			public void onClick() {
				System.out.println("OK 버튼을 클릭했습니다.");

			}
		});

		// OK 버튼 클릭
		buttonOK.click();

		// Cancel 버튼 객체 생성
		Button buttonCancel = new Button();

		// Cancel 버튼 객체에 익명 구현 객체로 CancelListener를 주입
		buttonCancel.setClickListener(new Button.ClickListener() {
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭했습니다.");
			}
		});

		// Cancel 버튼 클릭
		// 동일한 click() 메서드를 호출했을지라도, Button 클래스의 ClickListener 인터페이스에 어떤 구현 객체를 세팅하느냐에 따라 실행 결과가 달라진다. -> 다형성
		buttonCancel.click();
	}
}
