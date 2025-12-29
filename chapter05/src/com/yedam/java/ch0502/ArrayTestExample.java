package com.yedam.java.ch0502;

public class ArrayTestExample {

	public static void main(String[] args) {

		int[] numAray = { 1, 4, 9, 2, 5 };
		int min = numAray[0];
		int max = numAray[0];

		for (int i = 0; i < numAray.length; i++) {
			int current = numAray[i];
			
			System.out.println("current: " + current);
			
			if (current < min) {
				min = current;
			}
			
			if (current > max) {
				max = current;
			}
		}
		
		System.out.println("min: " + min);
		System.out.println("max: " + max);
	}

}
