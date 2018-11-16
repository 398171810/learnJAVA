package com.kj;

public class ForTest02 {
	/**
	 * q求1-15之间的偶数和
	 *  
	 */
	public static void main(String[] args) {
		int sum =0;
		for(int x=1; x<8; x++) {
			//拿到每一个数据对这个数进行判断
			if(x%2==0) {
				sum= sum+x;
			}
		}
		System.out.println("sum:"+sum);
	}
}
