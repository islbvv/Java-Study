package com.yedam.java.ch0801;

public interface RemoteControl {

	// 상수
	public final static int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0; // final static 없어도 됨

	// 추상메서드
	public abstract void turnOn();

	public void turnOff(); // abstract 없어도 됨

	public void setVolume(int volume);
}
