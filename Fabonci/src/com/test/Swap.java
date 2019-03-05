package com.test;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		
		int x= a.nextInt();
		int y= a.nextInt();
		
		System.out.println("Intial X element: "+x);
		System.out.println("Intial y element: "+y);
		
		x=x+y;
		
		y=x-y;
		
		x=x-y;
		
		System.out.println(" Swap of two numbers: "+ "x="+x +",y="+y);

	}

}
