package com.yedam.java.ch0802.field;

public class Car {
	Tire frontLeftTire = new HankookTire();
	Tire frontRigthTire = new HankookTire();
	Tire backLeftTire = new HankookTire();
	Tire backRigthTire = new HankookTire();

	void run() {
		frontLeftTire.roll();
		frontRigthTire.roll();
		backLeftTire.roll();
		backRigthTire.roll();
	}

}
