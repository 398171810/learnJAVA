package com.kj;

public class WhileDemo03 {
	/**
	 * while循环demo练习
	 * 大于90小于等于100之间的数且不等于95的数的结果
	 * @param args
	 */
	public static void main(String[] args) {
		int b=100;
		while(b>90 && b!=95) {
			System.out.println(b);
			b--;
		
		
		}
		System.out.println("--------------");
		int c=5;
		for(c=5;c<10;c++) {
			System.out.println("这是一个小于10大于5的数的循环，用for循环实现");
			
		}
	
	}

}
