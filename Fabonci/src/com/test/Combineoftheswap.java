package com.test;

import java.util.Scanner;

public class Combineoftheswap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner a = new Scanner( System.in);
		Scanner b= new Scanner(System.in);
		
		int x = a.nextInt();
		
		int y =a.nextInt();
		
		String ab= b.nextLine();
		
		String bc=b.nextLine();
		
		System.out.println("swap of two numbers before: x="+x+",y="+y);

		System.out.println("Swap of two strings before: ab="+ab+",bc="+bc);
		
		x=x+y;
		
		y=x-y;
		
		x=x-y;
		
		ab=ab+bc;
		
		bc=ab.substring(0,ab.length()-bc.length());
		
		ab = ab.substring(bc.length());
		
		System.out.println("swap of two numbers After: x="+x+",y="+y);

		System.out.println("Swap of two strings After: ab="+ab+",bc="+bc);
		
		
		
	}

}
