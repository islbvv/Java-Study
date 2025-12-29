package com.yedam.java.ch0501;

public class StringExample {

	public static void main(String[] args) {
		
		String str1 = "투명드래곤";
		String str2 = "투명드래곤";
		
		str2 = "투명드래곤이 울부짖었다";
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		
		int[] first = {1, 2, 3};
		int[] second = first;
		second[1] = 10;
		System.out.println(second[1]);
		
		int[] third = null;
		int[] third0 = {};
//		System.out.println(third.length);
		
		String strA = new String("투명드래곤");
		String strB = new String("투명드래곤");
		System.out.println("strA: " + strA);
		System.out.println("strB: " + strB);
		
		System.out.println("\nstrA == strB ?");
		if (strA == strB) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		System.out.println("\nstrA.equals(strB) ?");
		if (strA.equalsIgnoreCase(strB)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		
	}

}
