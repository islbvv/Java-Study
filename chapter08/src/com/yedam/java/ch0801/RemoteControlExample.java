package com.yedam.java.ch0801;

import java.util.Scanner;

public class RemoteControlExample {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		RemoteControl rc = null;

		while (true) {
			System.out.print("페어링 번호 선택: ");
			int selected = Integer.parseInt(sc.nextLine());

			if (selected == 1) { // 페어링 1번: TV
				rc = new Television();
				rc.turnOn();
				rc.setVolume(7);
				rc.turnOff();
			} else if (selected == 2) { // 페어링 2번: Audio
				rc = new Audio();
				rc.turnOn();
				rc.setVolume(3);
				rc.turnOff();
			} else {
				System.out.print("종료");
				break;
			}
		} // while
		sc.close();
		
		Television tv = new Television();

	} // main

} // class
