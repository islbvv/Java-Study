package com.yedam.java.ch0602;

public class MainExample {

	public static void main(String[] args) {

		Car myCar = new Car();

		System.out.println("제조사: " + myCar.comapny);
		System.out.println("모델명: " + myCar.model);
		System.out.println("색상: " + myCar.color);
		System.out.println("MaxSpeed: " + myCar.maxSpeed);

		myCar.currentSpeed = 120;
		System.out.println("현재 속도: " + myCar.currentSpeed);

	} // main
} // class
