package com.yedam.java.ch0502;

public class ArraryCommonExample {

	public static void main(String[] args) {

		int[] intAry = null;

		intAry = new int[] { 1, 3, 4 };
		System.out.println("길이: " + intAry.length);
		for(int i = 0; i < intAry.length; i++) {
			System.out.println(i + " / " + intAry[i]);
		}
		
		intAry = new int[5];
		System.out.println("\n길이: " + intAry.length);
		for(int i = 0; i < intAry.length; i++) {
			System.out.println(i + " / " + intAry[i]);
		}

	}

}
