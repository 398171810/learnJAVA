package com.kj03;

import java.util.Scanner;

public class MethodDemo06 {
	/**
	 * 键盘录入两个数，返回其中的较大的值
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("输入第一个值： ");
		int a = sc.nextInt();
		System.out.println("输入第二个值： ");
		int b = sc.nextInt();
		int max = getMax(a,b);
		System.out.println(max);
	}

	private static int getMax(int a, int b) {
		
		return 0;
	}
}
