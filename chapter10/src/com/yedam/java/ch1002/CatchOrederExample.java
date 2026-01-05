package com.yedam.java.ch1002;

public class CatchOrederExample {
	public static void main(String[] args) {
//		String[] ary = { "1", "이" };
		String[] ary = { "1", "2" };

		try {
//			String data1 = args[0];
//			String data2 = args[1];
			String data1 = ary[0];
			String data2 = ary[1];
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println("result: " + result);
		} catch (NumberFormatException e) {
			System.out.println("[ Error: 숫자가 아닙니다. ]");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("[ Error: 실행 매개값의 수가 부족합니다. ]");
		} finally {
			System.out.println("[ finally: 종료 ]");
		}
	}
}
