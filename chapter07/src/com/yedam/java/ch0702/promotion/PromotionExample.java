package com.yedam.java.ch0702.promotion;

public class PromotionExample {

	public static void main(String[] args) {

		Child child = new Child();
		System.out.println("자식 클래스 타입(Child)의 객체(Child)");
		child.method1();
		child.method2();
		child.method3();
		System.out.println();

		// 자동 타입변환
		Parent parent = child;
		System.out.println("부모 클래스 타입(Parent)의 객체(Child)");
		parent.method1();
		// 부모 타입이라도 오버라이딩된 자식의 메서드가 호출됨
		parent.method2();
		// 부모 타입은 자식의 고유 멤버에 접근할 수 없다
//		parent.method3();
		System.out.println();

		parent = new GrandChild();
		System.out.println("부모 클래스 타입(Parent)의 객체(GrandChild)");
		parent.method1();
		parent.method2();

	} // main

} // class
