package com.yedam.java.packge3;

public class Car {

	private int speed;
	private boolean stop;

	public int getSpeed() {
		return this.speed;
	}

	public void setSpeed(int speed) {
		if (speed < 0) {
			this.speed = 0;
			System.out.println("잘못된 값입니다.");
			return;
		}
		this.speed = speed;
	}

	public boolean isStop() {
		return this.stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
		this.speed = 0;
	}

}
