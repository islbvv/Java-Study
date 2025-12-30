package com.yedam.java.ch0701;

public class ComputerExample {

	public static void main(String[] args) {
		
		int r = 10;
		
		// 부모 클래스의 인스턴스
		Calculator cal = new Calculator();
		
		System.out.println("원면적: " + cal.areaCircle(r));
		System.out.println();
		
		// 자식 클래스의 인스턴스
		Computer com = new Computer();
		System.out.println("원면적: " + com.areaCircle(r));
		System.out.println();

	} // main

} // class
