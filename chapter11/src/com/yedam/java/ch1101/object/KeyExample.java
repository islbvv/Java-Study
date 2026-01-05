package com.yedam.java.ch1101.object;

import java.util.HashMap;
import java.util.Map;

public class KeyExample {
	public static void main(String[] args) {
		Map<Member, String> map = new HashMap<Member, String>();

		// 값을 저장
		map.put(new Member("A"), "홍길동");

		// 값을 읽을 때
		String name = map.get(new Member("A"));
		System.out.println(name);
		
		System.out.println(new Member("A"));

	} // main

} // class
