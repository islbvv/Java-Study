package com.yedam.java.ch0701;

// 부모
public class Calculator {

	double areaCircle(double r) {
		System.out.println("부모(Calculator) 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}

}
