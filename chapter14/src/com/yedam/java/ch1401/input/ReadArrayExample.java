package com.yedam.java.ch1401.input;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadArrayExample {
	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("D:/Temp/test2.db");

		while (true) {
			byte[] buffer = new byte[4];
			int readByteNum = is.read(buffer);
			
			if (readByteNum == -1) {
				System.out.println("파일 읽기 완료");
				is.close();
				break;
			}
			
			for (int i = 0; i < buffer.length; i++) {
				System.out.print(buffer[i] + " ");
			}
			System.out.println();
		}

	} // main
} // class
