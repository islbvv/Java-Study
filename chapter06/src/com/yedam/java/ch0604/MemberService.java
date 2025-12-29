package com.yedam.java.ch0604;

public class MemberService {

	String Id, Pw;

	MemberService(String Id, String Pw) {
		this.Id = Id;
		this.Pw = Pw;
	}

	public boolean login(String Id, String Pw) {
		return this.Id == Id && this.Pw == Pw ? true : false;
	}

	public String logout(boolean isLogout) {
		if (isLogout) {
			String result = "로그아웃 성공";
			return result;
		} else {
			String result = "[ Error : 로그아웃 실패 (로그인 상태 아님) ]";
			return result;
		}

	}
} // class
