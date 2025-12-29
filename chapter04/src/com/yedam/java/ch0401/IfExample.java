package com.yedam.java.ch0401;

public class IfExample {

	public static void main(String[] args) {

		int score = 100;
		String grade;

		if (score >= 60) {
			System.out.println("60점 이상");
			System.out.println("수료 완료");
		} else {
			System.out.println("60점 이하");
			System.out.println("수료 실패");
		}

		System.out.println("---------------------------------");

		switch (score / 10) {
		case 10:
			grade = "A+";
			break;
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		default:
			grade = "F";
		}

		System.out.println("등급: " + grade);

	}

}
