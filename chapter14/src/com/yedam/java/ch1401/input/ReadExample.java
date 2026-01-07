package com.yedam.java.ch1401.input;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample {
	public static void main(String[] args) throws Exception {
		InputStream us = new FileInputStream("D:/Temp/test2.db");
		while (true) {
			int data = us.read();
			if (data == -1) {
				break;
			}
			System.out.println(data);
		}

		us.close();

	} // main
} // class
