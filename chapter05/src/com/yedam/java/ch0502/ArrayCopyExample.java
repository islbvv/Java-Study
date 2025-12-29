package com.yedam.java.ch0502;

public class ArrayCopyExample {

	public static void main(String[] args) {

		int[] ogAry0 = { 1, 2, 3 };
		int[] copyAry0 = new int[3];

		for (int i = 0; i < ogAry0.length; i++) {
			copyAry0[i] = ogAry0[i] + 10;
			System.out.println("og: " + ogAry0[i] + " / copy: " + copyAry0[i]);
		}

		int[] copyAry1 = new int[10];
		int num = copyAry1.length - ogAry0.length;

		System.arraycopy(ogAry0, 0, copyAry1, num, ogAry0.length);

		for (int val : copyAry1) {
			System.out.println("copyAry1: " + val);
		}

	}

}
