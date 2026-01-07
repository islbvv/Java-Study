package task;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = (int) (Math.random() * 51) + 1;

		while (true) {
			System.out.print("숫자: ");
			int num2 = Integer.parseInt(sc.nextLine());

			if (num2 > num1) {
				System.out.println("down하세요.");
			} else if (num2 < num1) {
				System.out.println("up하세요.");
			} else if (num2 == num1) {
				System.out.println("정답!");
				break;
			}
		}

	} // main
} // class
