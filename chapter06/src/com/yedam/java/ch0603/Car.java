package com.yedam.java.ch0603;

public class Car {

	String comapny;
	String model;
	String color;
	int maxSpeed;
	int currentSpeed;

	public Car(String model, String color) {
		this("테슬라", model, color);
	}

	public Car(String model, String color, int maxSpeed) {
		this("테슬라", model, color);
		this.maxSpeed = maxSpeed;
	}

	public Car(String comapny, String model, String color) {
		this.comapny = comapny;
		this.model = model;
		this.color = color;
	}

} // class