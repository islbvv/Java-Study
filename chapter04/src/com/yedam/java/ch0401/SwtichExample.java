package com.yedam.java.ch0401;

public class SwtichExample {

	public static void main(String[] args) {
		
		int time = (int)(Math.random() * 4 ) + 8;
		System.out.println("현재 시간: " + time);
		
		switch(time) {
		case 8:
			System.out.println("출근");
		case 9:
			System.out.println("아침회의");
		case 10:
			System.out.println("업무 시작");
		default:
			System.out.println("외근 중");
		}

	}

}
