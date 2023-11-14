package part02.ch08.sec04.추상메서드;

public class Audio implements RemoteControl{
	private int volume;
	@Override
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("오디오를 끕니다.");
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
		System.out.println("현재 오디오 볼륨 : " + this.volume);
	}
}
