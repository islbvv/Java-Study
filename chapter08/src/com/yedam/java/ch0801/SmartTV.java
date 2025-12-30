package com.yedam.java.ch0801;

public class SmartTV implements RemoteControl, Searchable {

	// RemoteControl
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("[ TV 전원을 켭니다.]");
	}

	@Override
	public void turnOff() {
		System.out.println("[ TV 전원을 끕니다.]");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}

	// Searchable
	@Override
	public void search(String url) {
		System.out.println(url + "을(를) 검색합니다.");
	}

}
