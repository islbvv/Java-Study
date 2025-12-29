package com.yedam.java.ch0605;

public class CalculatorExample {

	public static void main(String[] args) {

		System.out.println("PI: " + Calculator.pi);

		int result = Calculator.plus(10, 5);
		System.out.println(result);

		result = Calculator.minus(28, 5);
		System.out.println(result);

	} // main
} // class
