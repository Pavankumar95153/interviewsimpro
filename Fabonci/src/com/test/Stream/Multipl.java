
//multiply the numbers by using functional Interface.
package com.test.Stream;

public class Multipl {
  public static void main(String[] args) {
    Finterface result = (a,b)-> a*b;
    System.out.println(result.multiply(2,3));

    /*Finterface finterface = new Finterface() {
      @Override
      public int multiply(int x, int b) {
        return x*b;
      }
    };
    System.out.println(finterface.multiply(1,4));*/
  }
}
