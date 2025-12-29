package com.yedam.java.ch0603;

import java.util.Scanner;

public class MainExample {

	public static void main(String[] args) {

		Calculator cal = new Calculator();

		int num1 = cal.plus(1, 2);
		System.out.println("[ 값: " + num1 + " ]\n");

		double num2 = cal.divide(426, 2478);
		System.out.println("[ 값: " + num2 + " ]\n");

		int[] datas;
		datas = new int[] { 1, 2, 3, 4, 5, 6 };
		int num3 = cal.plus(datas);
		System.out.println("[ 값: " + num3 + " ]\n");

		int num4 = cal.minus(1, 2, 3, 4);
		System.out.println("[ 값: " + num4 + " ]\n");

//		Scanner scanner = new Scanner(System.in);

//		while (true) {
//			System.out.println("1. 전원 | 2. 더하기 | 3. 나누기 | 5. 종료");
//			System.out.print("선택: ");
//			int select = Integer.parseInt(scanner.nextLine());
//
//			if (select == 1) {
//				cal.powerOnOff();
//				System.out.println();
//
//			} else if (select == 2) {
//				int result = cal.plus(1, 2);
//				System.out.println("[ 값: " + result + " ]\n");
//
//			} else if (select == 3) {
//				double result = cal.divide(426, 2478);
//				System.out.println("[ 값: " + result + " ]\n");
//
//			} else if (select == 5) {
//				System.out.println("[ 시스템 종료 ]\n");
//				break;
//
//			} else {
//				System.out.println("[ Error : 잘못 입력하셨습니다. ]\n");
//			}
//
//		}

	} // main
} // class
