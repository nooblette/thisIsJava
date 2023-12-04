package part03.ch16.sec02.매개변수가없는람다식;

public class ButtonExample {
	public static void main(String[] args) {
		// Ok 버튼 생성
		Button ok1 = new Button();

		// Ok 버튼 객체에 ClickListener 익명 구현 객체 전달
		ok1.setClickListener(new Button.ClickListener() {
			@Override
			public void onClick() {
				System.out.println("Ok 버튼을 클릭");
			}
		});
		ok1.click();

		Button ok2 = new Button();
		// Ok 버튼 객체에 람다식으로 ClickListener 익명 구현 객체 전달
		ok2.setClickListener(() -> System.out.println("Ok 버튼을 클릭"));
		ok2.click();

		// Cancel 버튼 생성
		Button cancel1 = new Button();
		cancel1.setClickListener(new Button.ClickListener() {
			@Override
			public void onClick() {
				System.out.println("Cancel 버튼을 클릭");
			}
		});
		cancel1.click();

		Button cancel2 = new Button();
		cancel2.setClickListener(() -> System.out.println("Cancel 버튼을 클릭"));
		cancel2.click();
	}
}
