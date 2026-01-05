package com.yedam.java.ch1101.clazz;

public class ClassExample {
	public static void main(String[] args) throws ClassNotFoundException {
		Class StringMeta = Class.forName("java.lang.String");
		System.out.println(StringMeta.getName());
		System.out.println(StringMeta.getPackageName());
		System.out.println(StringMeta.getSimpleName());
		System.out.println(StringMeta.getFields()[0]);
		System.out.println(StringMeta.getMethods()[0]);
	} // main
} // class
