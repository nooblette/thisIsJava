package part02.ch08.sec05.디폴트메서드;

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
		if(volume > part02.ch08.sec04.추상메서드.RemoteControl.MAX_VOLUME){
			this.volume = part02.ch08.sec04.추상메서드.RemoteControl.MAX_VOLUME;
			getVolume();
			return;
		}

		if(volume < part02.ch08.sec04.추상메서드.RemoteControl.MIN_VOLUME){
			this.volume = part02.ch08.sec04.추상메서드.RemoteControl.MIN_VOLUME;
			getVolume();
			return;
		}

		this.volume = volume;
		getVolume();
	}

	private void getVolume(){
		System.out.println("현재 오디오 볼륨 : " + this.volume);
	}

	private int memoryVolume;

	// 디폴트 메서드 재정의
	@Override
	public void setMute(boolean mute){
		if(mute){
			this.memoryVolume = volume;
			System.out.println("무음 처리합니다.");
			setVolume(RemoteControl.MIN_VOLUME);
		} else {
			System.out.println("무음 해제합니다.");
			setVolume(this.memoryVolume);
		}
	}
}
