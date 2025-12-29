package com.yedam.java.packge3;

import java.util.Scanner;

public class StdExample {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		boolean run = true;
		int studentNum = 0;
		Std[] scoreList = null;

		while (run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1. 학생 수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
			System.out.println("----------------------------------------------------");
			System.out.print("메뉴 선택: ");
			int select = Integer.parseInt(scanner.nextLine());

			if (select == 1) {
				System.out.println("[ 1.학생 수 ]");
				System.out.print("학생 수: ");
				studentNum = Integer.parseInt(scanner.nextLine());
				scoreList = new Std[studentNum];

			} else if (select == 2) {
				System.out.println("[ 2.점수 ]");
				for (int i = 0; i < studentNum; i++) {
					System.out.print("이름: ");
					String name = scanner.nextLine();

					System.out.print("국어: ");
					int korScore = Integer.parseInt(scanner.nextLine());

					System.out.print("영어: ");
					int engScore = Integer.parseInt(scanner.nextLine());

					System.out.print("수학: ");
					int mathScore = Integer.parseInt(scanner.nextLine());

					Std std = new Std(name, korScore, engScore, mathScore);
					scoreList[i] = std;
				}

			} else if (select == 3) {
				System.out.println("[ 3.점수 리스트 ]");
				for (int i = 0; i < studentNum; i++) {
					scoreList[i].showInfo();
				}

			} else if (select == 4) {
				System.out.println("[ 4.분석 ]");

			} else if (select == 5) {
				System.out.println("[ 5.종료 ]");
				System.out.print("");
				run = false;
				break;

			} else {
				System.out.println("[ Error: 잘못 입력하셨습니다. ]");
			}

		} // while

	} // main
} // class
