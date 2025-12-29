package com.yedam.java.ch0603;

public class Calculator {

	boolean power;

	void powerOnOff() {
		if (this.power) {
			this.power = !this.power;
			System.out.println("[ 전원 Off ]");
		} else {
			this.power = !this.power;
			System.out.println("[ 전원 On ]");
		}
	}

	// 연산
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}

	// 배열로 값을 받아옴
//	int plus(int[] values) {
//		int result = 0;
//		for (int val : values) {
//			result += val;
//		}
//		return result;
//	}

	// 가변 파라미터
	int plus(int... values) {
		int result = 0;
		for (int val : values) {
			result += val;
		}
		return result;
	}

	int minus(int... values) {
		int result = 0;
		for (int val : values) {
			result -= val;
		}
		return result;
	}

	// 나누기
	double divide(double x, double y) {
		double result = x / y;
		return result;
	}

}
