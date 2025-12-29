package com.yedam.java.ch0302;

import java.util.Scanner;

public class ConditinalOperationExpamle {

	public static void main(String[] args) {
		
		Scanner scaner = new Scanner(System.in);
		int score = scaner.nextInt();
		
		String grade = score >= 90 ? "A" : "B";
		System.out.println("성적: " + grade);

	}
	
}
