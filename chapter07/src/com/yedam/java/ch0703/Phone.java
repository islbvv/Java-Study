package com.yedam.java.ch0703;

// 추상클래스(abstract): 본인의 인스턴스를 못 가짐
public abstract class Phone {

	// 필드
	public String owner;

	// 생성자
	public Phone(String owner) {
		this.owner = owner;
	}

	// 메서드
	public void turnOn() {
		System.out.println("[ 전원을 킵니다. ]");
	}

	public void turnOff() {
		System.out.println("[ 전원을 끕니다. ]");
	}
	
}
