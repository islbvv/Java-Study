package com.yedam.java.ch0702.casting;

public class CastingExample {

	public static void main(String[] args) {

		// 강제타입변환 실패
		Parent p = new Parent();

		if (p instanceof Child) {
			Child c = (Child) p;
			c.method1();
			c.method2();
			c.method3();
		} else {
			System.out.println("해당 인스턴스는 Child의 객체가 아닙니다.");
		}
		System.out.println();

		// 실제로 강제타입변환을 쓰는 경우
		Child child = new Child();
		Parent parent = child;
		parent.method1();
		parent.method2();
		System.out.println();

		// -> 자식클래스의 고유멤버를 사용해야 되는 경우
		if (parent instanceof Child) {
			child = (Child) parent;
			child.method3();
		} else {
			System.out.println("해당 인스턴스는 Child의 객체가 아닙니다.");
		}

	} // main

} // class
