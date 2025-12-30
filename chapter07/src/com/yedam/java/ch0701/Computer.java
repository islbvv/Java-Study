package com.yedam.java.ch0701;

// 자식
public class Computer extends Calculator {

	// 어노테이션(@): 덧붙이는 기능
	@Override // 컴파일할 때 메서드 오버라이딩 체크 요청
	double areaCircle(double r) {
		System.out.println("자식(Computer) 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
}
