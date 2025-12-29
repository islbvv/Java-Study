package com.yedam.java.ch0502;

public class MultiArayExample {

	public static void main(String[] args) {

		String[] strAray = { "투명드래곤이", "울부짖었다", "투명드래곤은 졸라짱쎄다" };

//		for (String text : strAray) {
//			System.out.println(text);
//		}

		int[][] intAry = null;
		intAry = new int[][] { { 1, 2 }, { 3, 4, 5 } };

//		for (int i = 0; i < intAry.length; i++) {
//			int[] currentAry = intAry[i];
//
//			for (int j = 0; j < currentAry.length; j++) {
//				int curVal = currentAry[j];
//				
//				System.out.println(i + " / " + j + " / " + curVal);
//			}
//			System.out.println("------------");
//		}

		intAry = new int[2][];
		intAry[0] = new int[] { 1, 2, 3 };
		intAry[1] = new int[] { 3, 4, 5 };

		for (int i = 0; i < intAry.length; i++) {
			int[] currentAry = intAry[i];

			for (int j = 0; j < currentAry.length; j++) {
				int curVal = currentAry[j];

				System.out.println(i + "번째 행의 / " + j + "번째 열의 값: " + curVal);
			}
			System.out.println("------------");
		}

	} // main

} // class
