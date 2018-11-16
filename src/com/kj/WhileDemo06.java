package com.kj;

public class WhileDemo06 {
	/**
	 * while测试
	 */
	public static void main(String[] args) {
		int sum =0;
		int x=1;
		while(x<8) {
			//x =sum+x;
			sum =sum+x;
			x++;
		}
		System.out.println(sum);
	}

}
