package com.yedam.java.ch0601;

public class MainExample {

	public static void main(String[] args) {

		Card song = new Card("1111", "30/12", "Song", 777);
		Card seung = new Card("2222", "31/01", "Seung", 888);

		song.transport("버스");
		song.payment(15000);
		song.payment(4500);

		seung.transport("제트기");
		seung.payment(2000000);
		System.out.println(seung.userName + "의 총 이용 금액: " + seung.amount);
		System.out.println(seung.userName + "의 총 교통 비용: " + seung.transportAmount);

	}

}
