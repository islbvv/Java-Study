package com.yedam.java.ch0601;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean run = true;
		int[] scores = null;

		while (run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1. 학생 수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
			System.out.println("----------------------------------------------------");
			System.out.print("메뉴 선택: ");
			int select = Integer.parseInt(scanner.nextLine());

			switch (select) {
			case 1:
				System.out.print("학생 수 입력: ");
				int stdNum = Integer.parseInt(scanner.nextLine());
				scores = new int[stdNum];
				break;
			case 2:
				for (int i = 0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]" + " 점수 입력: ");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
				break;
			case 3:
				System.out.println("점수 리스트");
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
				break;
			case 4:
				System.out.println("점수 분석");
				int min = scores[0];
				int max = scores[0];

				for (int score : scores) {
					if (score > max) {
						max = score;
					} else if (score < min) {
						min = score;
					}
				}
				
				System.out.println("Min: " + min);
				System.out.println("Max: " + max);

				break;
			case 5:
				System.out.println("프로그램 종료");
				run = false;
				break;
			default:
				System.out.println("[ Error: 잘못 입력하셨습니다. ]\n");
			} // switch

		} // while

	} // main

} // class