package com.test;

public class Prime {

	public static void main(String[] args) {
	int i,m=0,flag=0;
	int i1=4;
	m=i1/2;
	
	for( i=2;i<=m;i1++) {
		if(i1%i==0) {
			System.out.println(i1+" is not prime number");      
		     flag=1;      
		     break;   
		}
		
			
		}
	
	if(flag==0) {
		 System.out.println(i1+" is prime number");
	}
	}

}
