package com.yedam.java.ch0402;

public class Test {

	public static void main(String[] args) {

		String text = "";

		for (int num = 0; num < 5; num++) {
			for (int loop = 4; loop >= 0; loop--) {
				text += num < loop ? " " : "*";
			}
			System.out.println(text);
			text = "";

		} // for

	} // main
}// class
