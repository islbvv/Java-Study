package com.yedam.java.ch0604;

public class MemberExample {

	public static void main(String[] args) {

		MemberService user1 = new MemberService("abc", "123");

		boolean result = user1.login("abc", "123");

		if (result) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("[ Error : 로그인 실패 (정보 불일치) ]");
		}

		String logOutResult = user1.logout(result);
		System.out.println(logOutResult);

	}

}
