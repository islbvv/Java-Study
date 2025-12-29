package com.yedam.java.ch0204;

import java.util.Scanner;

public class ScannerCommonExample {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		String inputData = scanner.nextLine();
		System.out.println(inputData);
		
		scanner.close();
		
	}
}
