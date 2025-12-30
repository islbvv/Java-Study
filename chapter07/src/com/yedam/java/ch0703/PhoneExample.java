package com.yedam.java.ch0703;

public class PhoneExample {

	public static void main(String[] args) {

		SamrtPhone samrtPhone = new SamrtPhone("승일");
		
		samrtPhone.turnOn();
		System.out.println(samrtPhone.owner);
		samrtPhone.internetSearch();
		samrtPhone.turnOff();
	} // main
	
} // class
