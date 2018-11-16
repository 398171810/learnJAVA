package com.kj;

public class WhileDemo04 {
	/**
	 * while循环获取1-10之间的数的和
	 */
	public static void main(String[] args) {
		int sum =0;
		int x=1;
		while(x<10) {
			
			sum =sum+x;
			x++;
		}
		System.out.println("sum"+sum);
	}

}
