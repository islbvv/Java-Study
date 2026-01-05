package com.yedam.java.ch1101.object;

public class Member {
	public String id;

	public Member(String id) {
		this.id = id;
	}

	// 동일한 아이디를 가지면 "같다"로 표시
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Member) {
			Member member = (Member) obj;
			return member.id.equals(this.id) == true ? true : false;
		}
		return false;
	}

	// Map의 Key로 설정하기 위해 추가
	@Override
	public int hashCode() {
		return this.id.hashCode();
	}

	// 직렬화(Serialize, 객체를 문장으로 변환) 메서드
	@Override
	public String toString() {
		return "Member - id: " + this.id;
	}

} // class
