package com.yedam.java.ch0501;

public class ReperenceCommonExample {

	public static void main(String[] args) {
		String meg = "Hello";
		
		boolean result = firstMethod();
		
		System.out.println(meg);
		System.out.println("result: " + result);

	} // main
	
	public static boolean firstMethod() {
		char v1 = 'A';
		
		if (v1 == 'A') {
			int v2 = 100;
			double v3 = 3.14;
		}
		
		boolean v4 = true;
		return v4;
	} // firstMethod

} // main
