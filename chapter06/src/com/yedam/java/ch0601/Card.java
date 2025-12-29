package com.yedam.java.ch0601;

public class Card {

	// 필드
	String type; // 카드 종류
	String company; // 카드사
	String cardNo; // 카드 번호
	String period; // 유효기간: 년월
	String userName; // 사용자 이름
	int cvc; // CVC
	int amount = 0; // 결제대금
	int transportAmount = 0;

	// 생성자
	Card(String cardNo, String period, String userName, int cvc) {
		this.type = "마스터";
		this.company = "삼성";
		this.cardNo = cardNo;
		this.period = period;
		this.userName = userName;
		this.cvc = cvc;
	}

	// 결제
	void payment(int price) {
		this.amount += price;
		System.out.println("[ " + this.userName + "님이 결제를 하였습니다 (" + price + ") ]");
	}

	// 지급(청구)
	void bill() {
		this.amount = 0;
	}

	// 교통카드
	void transport(String type) {
		if (type.equals("버스")) {
			this.transportAmount += 1500;
		} else if (type.equals("제트기")) {
			this.transportAmount += 700000000;
			System.out.println("[ *** 비상 ! ! ! *** ]");
			System.out.println("[ *** " + this.userName + "님이 출근하는데 제트기(7억)를 이용하였습니다. *** ]");
		} else {
			this.transportAmount += 2000;
		}
	}

}
