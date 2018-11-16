package com.kj02;

/**
 * @author tao
 * 循环打印出一个正三角形
 */
public class ForForDemo01 {
	public static void main(String[] args) {
		for(int y=1; y<=5; y++) {
			for(int x=1; x<=8; x++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
