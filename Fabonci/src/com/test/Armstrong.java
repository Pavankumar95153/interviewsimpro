package com.test;

public class Armstrong {

	public static void main(String[] args) {
		
		int c=0,temp,a,n=13;
		temp=n;
		 while(n>0)
		 {
			 a=n%10;
			 n=n/10;
			 c=c+(a*a*a);
		 }
	if(temp==c) {
		System.out.println("Given number is Armstrong");
		
	}
	else {
		System.out.println("Given number is not armstrong");
	}
	}
	

}
