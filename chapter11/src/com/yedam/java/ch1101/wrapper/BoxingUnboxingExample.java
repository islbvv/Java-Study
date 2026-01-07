package com.yedam.java.ch1101.wrapper;

public class BoxingUnboxingExample {
	public static void main(String[] args) {
		// 박싱
		Integer obj1 = new Integer(100);
		Integer obj2 = 200;
		Integer obj3 = 200;
		if (obj2 == obj3) {
			System.out.println("같은 객체입니다.");
		}else {
			System.out.println("다른 객체입니다.");
		}
		
		// 언박싱
	}
}
