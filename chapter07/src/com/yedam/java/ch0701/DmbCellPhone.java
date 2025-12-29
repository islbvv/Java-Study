package com.yedam.java.ch0701;

public class DmbCellPhone extends CellPhone {

	// 필드
	int channel;

	// 생성자
	DmbCellPhone(String model, String color, int channel) {
		// super
		// 자식이 부모의 생성자에 접근할 경우 사용하는 문법
		// 부모 생성자 호출은 무조건 첫 번째 줄에 작성
		super(model, color);
		
		this.channel = channel;
		System.out.println("자식 인스턴스 생성");
	}

	// 메소드
	void turnOnDmb() {
		System.out.println("채널 " + this.channel + "번 DMB 방송 수신을 시작합니다.");
	}

	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널을 " + this.channel + "번으로 바꿉니다.");
	}

	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
} // class
