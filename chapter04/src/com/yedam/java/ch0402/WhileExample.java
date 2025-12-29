package com.yedam.java.ch0402;

public class WhileExample {

	public static void main(String[] args) {
		
		int i = 1;
//		while(i <= 10) {
//			System.out.println(i);
//			i++;
//		}
		
		while(true) {
			if(i > 10) break;
			System.out.println(i);
			i++;
		}

	}

}
