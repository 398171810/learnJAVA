package com.kj;

public class WhileDemo05 {
	/**
	 * while循环之90-100之间的数求和
	 */
	public static void main(String[] args) {
		int sum=0;
		int x=90;
		while(x<100) {
			sum=sum+x;
			x++;
		}
		//输出结果
		System.out.println(sum);
	}

}
