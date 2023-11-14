package part02.ch08.sec04.추상메서드;

public class Television implements RemoteControl{
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("텔레비젼을 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("텔레비전을 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME){
			this.volume = RemoteControl.MAX_VOLUME;
			getVolume();
			return;
		}

		if(volume < RemoteControl.MIN_VOLUME){
			this.volume = RemoteControl.MIN_VOLUME;
			getVolume();
			return;
		}

		this.volume = volume;
		getVolume();
	}

	private void getVolume(){
		System.out.println("현재 텔레비젼 볼륨 : " + this.volume);
	}
}
