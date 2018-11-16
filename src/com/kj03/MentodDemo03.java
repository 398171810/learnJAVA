package com.kj03;

public class MentodDemo03 {
	public static int sum(int a, int b) {
		return a + b;
	}
	/**
	 * 有返回值的方法调用
	 */
	public static void main(String[] args) {
		//单独调用
		
		//sum（10，25）
		//System.out.println(10,25);
		int s = sum(10, 25);
		System.out.println("s:"+s);
	}
	

}

