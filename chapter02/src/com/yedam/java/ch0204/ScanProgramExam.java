package com.yedam.java.ch0204;

import java.util.Scanner;

public class ScanProgramExam {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputData = null;
		
		while (true) {
			inputData = scanner.nextLine();
			if (inputData.equals("q")) {
				System.out.printf("\"%s\" 입력 감지.. 시스템 종료...", inputData);
				break;
			}
			System.out.printf("값: %s\n", inputData);
		}
		scanner.close();

	}

}
