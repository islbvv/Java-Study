package com.yedam.java.ch1101.wrapper;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		String newDate = sdf.format(now);
		System.out.println(newDate);

		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd");
		String dateStr = "20251231";
		try {
			Date date = format.parse(dateStr);
			System.out.println(date);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
