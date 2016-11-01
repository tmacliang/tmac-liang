package com.fh.test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FnTest {
	
	public static void main(String[] args) {
		System.out.println("开始时间：" + getCureDateTimeSSS());
		f2(50);
		System.out.println("结束时间：" + getCureDateTimeSSS());
	}
	
	public static int f1(int n){
		if(n <= 2) return n;
		int x = f1(n-1) + f1(n-2);
		return x;
	}
	
	
	public static int f2(int n) {
		if (n <= 2){
			return n;
		}
	 
		int first = 1, second = 2;
		int third = 0;
	 
		for (int i = 3; i <= n; i++) {
			third = first + second;
			first = second;
			second = third;
		}
	 
		return third;
	}
	
	public static String getCureDateTimeSSS(){
		String time = null;
		try {
			DateFormat myformat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
			time = myformat.format(new Date());
		} catch (Exception e) {
			System.out.println(e);
		}
		return time;
	}
	

}
