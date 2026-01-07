package test;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = 0;
		int num2 = 0;
		boolean run = true;

		while (run) {
			System.out.println("--------------------------------");
			System.out.println("1. 예금 | 2. 출금 | 3. 잔액 | 4. 종료");
			System.out.println("--------------------------------");

			System.out.print("메뉴 선택: ");
			int selected = Integer.parseInt(sc.nextLine());

			switch (selected) {
			case 1:
				System.out.print("예금액: ");
				num2 = Integer.parseInt(sc.nextLine());
				num1 += num2;
				break;
			case 2:
				System.out.print("출금액: ");
				num2 = Integer.parseInt(sc.nextLine());
				if (num2 > num1) {
					System.out.println("잔액이 부족합니다.");
					System.out.println("출금 가능액: " + num1);
					break;
				}
				num1 -= num2;
				break;
			case 3:
				System.out.println("현재 잔액: " + num1);
				break;
			case 4:
				System.out.println("종료");
				run = false;
				break;
			default:
				System.out.println("다시 입력해주세요.");
			}
		}

	} // main
} // class
