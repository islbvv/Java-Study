package com.yedam.java.packge3;

public class Std {

	// private은 외부에서 접근이 불가능
	// 그래서 getter, setter가 필요
	private String name;
	private int kor, eng, math;

	// 생성자
	public Std() {

	}

	public Std(String name, int kor, int eng, int math) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	// getter
	public String getName() {
		return this.name;
	}

	public int getKor() {
		return this.kor;
	}

	public int getEng() {
		return this.eng;
	}

	public int getMath() {
		return this.math;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}

	// 메서드
	public void showInfo() {
		String info = "이름: " + this.name + " / 국어: " + this.kor + " / 영어: " + this.eng + " / 수학: " + this.math;
		System.out.println(info);
	}

} // class
