package com.yedam.java.ch1401.charater;

import java.io.FileWriter;
import java.io.Writer;

public class WriterExample {
	public static void main(String[] args) throws Exception {
		Writer writer = new FileWriter("D:/Temp/test3.txt");

		String message = "투명드래곤이\n울부짖었다.";
		writer.write(message);

		writer.flush();
		writer.close();

	} // main
} // class
