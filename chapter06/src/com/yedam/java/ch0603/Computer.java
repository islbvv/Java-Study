package com.yedam.java.ch0603;

public class Computer {

	int plus(int[] values) {
		int sum = 0;

		for (int i = 0; i < values.length; i++) {
			System.out.println(values[i]);
			sum += values[i];

			values[i] = values[i] * 2;
		}

		return sum;
	}
}
