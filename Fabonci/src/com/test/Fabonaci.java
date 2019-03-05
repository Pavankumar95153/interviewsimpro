package com.test;

public class Fabonaci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int sum, t1=0,t2=1, n=10;
  
  for (int i=1;i<n;++i) {
	  System.out.print(t1 +"+");
	  int sum1 =t1+t2;
	  t1=t2;
	  t2=sum1;
	 
  }
	}

}
