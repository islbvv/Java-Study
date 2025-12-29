package com.yedam.java.ch0402;

public class BrakeContinueExample {

	public static void main(String[] args) {

		for (int i = 1; i < 10; i++) {
			if (i % 2 == 1)
				continue;

			for (int j = 1; j <= 9; j++) {
//				System.out.printf("%d * %d = %d\n", i, j, (i * j));
			}
		}

		// 중첩 반복문에서 break 활용
		BlueArchive:for (char upper = 'A'; upper <= 'Z'; upper++) {
			for (char lower = 'a'; lower <= 'z'; lower++) {
				System.out.println(upper + " - " + lower);

				if (lower == 'g') {
					break BlueArchive;
				}
			}
		}

	}

}
