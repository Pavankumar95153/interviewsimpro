package com.test.Stream;

import java.util.Arrays;
import java.util.List;

public class LimitSkip {

  public static void main(String[] args) {
      List<Integer> list = Arrays.asList(10,20,30,4,68,10,30,40,50,20,20);
    // using limit function
    list.stream().limit(7).forEach(x -> System.out.println(x));

    // using Skip function
    list.stream().skip(7).forEach(x -> System.out.println(x));
  }
}
