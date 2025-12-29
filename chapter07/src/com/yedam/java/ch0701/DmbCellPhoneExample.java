package com.yedam.java.ch0701;

public class DmbCellPhoneExample {

	public static void main(String[] args) {
		// 자식 클래스 생성자 호출
		DmbCellPhone dmbCellPhone = new DmbCellPhone("아이폰", "화이트", 10);

		// 부모(CellPhone)에게 상속받은 필드
		System.out.println("모델: " + dmbCellPhone.model);
		System.out.println("색상: " + dmbCellPhone.color);

		// 부모(CellPhone)에게 상속받은 메서드
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("엘..");
		dmbCellPhone.receiveVoice("프사이..");
		dmbCellPhone.sendVoice("콩그루..");
		dmbCellPhone.powerOff();
		System.out.println();

		// 자식 필드
		System.out.println("채널: " + dmbCellPhone.channel);

		// 자식 메서드
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.changeChannelDmb(12);
		dmbCellPhone.turnOffDmb();

	} // main
} // class
