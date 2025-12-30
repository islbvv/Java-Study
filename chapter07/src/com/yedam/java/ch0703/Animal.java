package com.yedam.java.ch0703;

// 부모
// 추상클래스: 클래스를 만들 때 정의할 공통사항을 포함한 클래스
//			-> 추상메서드: 강제성을 띄는 메서드
public abstract class Animal {

	// 필드
	public String kind;

	// 생성자

	// 메서드
	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}
	
	// 추상 메서드: 일반 메서드와 달리 실행블록이 없음
	//		   	 -> 메서드 오버라이딩 용
	public abstract void sound();

} // class
