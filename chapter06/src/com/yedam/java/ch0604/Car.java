package com.yedam.java.ch0604;

public class Car {

	int speed;

	void keyTurnOn() {
		System.out.println("시동 On");
	}

	void keyTurnOff() {
		System.out.println("시동 Off");
	}

	int getSpeed() {
		return this.speed;
	}

	void setSpeed(int speed) {
		if (speed > 0) {
			this.speed = speed;
		}
	}

	void run() {
		for (int i = 10; i <= 50; i += 10) {
			this.setSpeed(i);
			System.out.printf("속도: %d\n", this.getSpeed());
		}
	}

} // class
