package com.test;

import java.util.Scanner;

public class SwapofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner ab = new Scanner(System.in);
		
		String a = ab.nextLine() ;
		String b = ab.nextLine();
		
		System.out.println("String before Swap: a="+a+",b="+b);
		
		a=a+b;
		b=a.substring(0,a.length() -b.length());
		a=a.substring(b.length());
		
		System.out.println("String after swap: a = "+a +",b="+b);
	}

}
