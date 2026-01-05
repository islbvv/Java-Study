package com.yedam.java.ch1002;

public class ThrowsExample {

	public static void main(String[] args) {
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

	} // main

	public static void findClass() throws ClassNotFoundException, NullPointerException {
		Class clazz = Class.forName("java.rang.String2");
	}

} // class