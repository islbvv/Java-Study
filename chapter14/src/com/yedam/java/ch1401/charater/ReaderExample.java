package com.yedam.java.ch1401.charater;

import java.io.FileReader;
import java.io.Reader;

public class ReaderExample {
	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("D:/Temp/test3.txt");

		char[] buffer = new char[10];

		while (true) {
			int readCharNum = reader.read(buffer);

			if (readCharNum == -1) {
				System.out.println("파일 읽기 완료");
				reader.close();
				break;
			}

			for (char str : buffer) {
				System.out.print(str);
			}

			System.out.println("\n");
		

	} // main
} // class
