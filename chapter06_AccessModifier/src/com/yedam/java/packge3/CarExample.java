package com.yedam.java.packge3;

public class CarExample {

	public static void main(String[] args) {

		Car myCar = new Car();

		// 잘못된 속도
		myCar.setSpeed(-50);

		System.out.println("현재 속도 : " + myCar.getSpeed());

		// 올바른 속도
		myCar.setSpeed(50);
		System.out.println("현재 속도 : " + myCar.getSpeed());
		
		// stop
		if (!myCar.isStop()) {
			myCar.setStop(true);
		}

		System.out.println("현재 속도 : " + myCar.getSpeed());

	}

}
