package com.yedam.java.ch0801;

public class SmartTVExample {

	public static void main(String[] args) {

		SmartTV smartTV = new SmartTV();
		smartTV.turnOn();
		smartTV.setVolume(7);
		smartTV.search("블루 아카이브");
		smartTV.turnOff();
		System.out.println();

		RemoteControl rc = smartTV;
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();
		System.out.println();
		
		Searchable search = smartTV;
		search.search("페이트 그랜드 오더");
		System.out.println();

	} // main

} // class
