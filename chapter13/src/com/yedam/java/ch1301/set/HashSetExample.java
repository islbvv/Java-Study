package com.yedam.java.ch1301.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();

		// 객체 추가
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java");
		set.add("iBATS");

		// 크기
		int size = set.size();
		System.out.println("총 객체 수: " + size);

		// 반복자
		Iterator<String> iterator = set.iterator();
		while (iterator.hasNext()) {
			String skill = iterator.next();
			System.out.println("\t" + skill);

		}
		System.out.println();
		
		// 객체 제거
		set.remove("JDBC");
		set.remove("iBATS");

		for (String str : set) {
			System.out.println("\t" + str);
		}

	} // main
} // class
