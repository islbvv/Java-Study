package com.yedam.java.ch0802.field;

public class CalExample {

	public static void main(String[] args) {

		Car myCar = new Car();

		myCar.run();
		System.out.println();

		myCar.frontLeftTire = new KumhoTire();
		myCar.frontRigthTire = new KumhoTire();
		myCar.run();

	} // main

} // class
