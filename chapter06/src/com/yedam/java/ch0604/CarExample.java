package com.yedam.java.ch0604;

public class CarExample {

	public static void main(String[] args) {

		Car myCar = new Car();
		Car BMW = new Car();

		myCar.keyTurnOn();
		myCar.run();

		int speed = myCar.getSpeed();
		System.out.println("현재 속도: " + speed);

		myCar.keyTurnOff();

		System.out.println();

		BMW.keyTurnOn();
		BMW.run();

		speed = BMW.getSpeed();
		System.out.println("현재 속도: " + speed);

		BMW.keyTurnOff();

	}

}
