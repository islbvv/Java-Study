package com.yedam.java.ch1301.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		// 객체 추가
		list.add("Java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");

		// 객체 수정
		list.set(0, "자바");

		// 크기
		int size = list.size();
		System.out.println("총 객체의 수: " + size);
		System.out.println();

		// 조회
		String skill = list.get(2);
		System.out.println("2: " + skill);
		System.out.println();

		for (int i = 0; i < size; i++) {
			String str = list.get(i);
			System.out.println(i + ": " + str);
		}
		System.out.println();

		// 삭제
		list.remove(2);
		list.remove(2);
		list.remove("iBATIS");

		for (String str : list) {
			System.out.println(str);
		}

	} // main
} // class
