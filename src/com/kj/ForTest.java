package com.kj;

public class ForTest {
	/**
	 * 求1-10之间的数的和
	 */
	public static void main(String[] args) {
		int sum =0;
		for(int x=1; x<11; x++) {
			sum = sum +x;
		}
		System.out.println("sum:"+sum);
	}

}
