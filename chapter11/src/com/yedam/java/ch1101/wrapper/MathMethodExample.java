package com.yedam.java.ch1101.wrapper;

public class MathMethodExample {
	public static void main(String[] args) {
		// ceil: 올림값
		double v1 = Math.ceil(5.3);
		double v2 = Math.ceil(-5.3);
		System.out.println("v1: " + v1);
		System.out.println("v2: " + v2);
		System.out.println();

		// floor: 버림값
		double v3 = Math.floor(5.3);
		double v4 = Math.floor(-5.3);
		System.out.println("v3: " + v3);
		System.out.println("v4: " + v4);
		System.out.println();

		// rint: 가까운 정수의 실수값
		double v5 = Math.rint(5.3);
		double v6 = Math.rint(4.5);
		double v7 = Math.rint(5.5);
		System.out.println("v5: " + v5);
		System.out.println("v6: " + v6);
		System.out.println("v7: " + v7);
		System.out.println();

		// round: 반올림값
		double v8 = Math.round(5.3);
		double v9 = Math.round(4.5);
		double v10 = Math.round(5.5);
		System.out.println("v8: " + v8);
		System.out.println("v9: " + v9);
		System.out.println("v10: " + v10);
		System.out.println();
		
	} // main
} // class
