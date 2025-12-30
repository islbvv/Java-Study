package com.yedam.java.ch0702.field;

public class Tire {

	// 필드
	public int maxRotation; // 최대 회전수(수명)
	public int accumulatedRotation; // 누적회전수
	public String location; // 타이어 위치

	// 생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}

	// 메서드
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(this.location + " Tire 수명: " + (maxRotation - accumulatedRotation) + "회");
			return true;
		} else {
			System.out.println("[ !!! " + location + " Trie 펑크 !!! ]");
			return false;
		}
	}

}
