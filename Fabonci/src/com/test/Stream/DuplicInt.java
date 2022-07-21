package com.test.Stream;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicInt {

  public static void main(String[] args) {
//      List<Integer> list = new ArrayList<Integer>(10,20,30,4,68,10,30,40,50,20,20);
      List<Integer> list = Arrays.asList(10,20,30,4,68,10,30,40,50,20,20);
      Set <Integer> set = new HashSet<Integer>();

    //It will give unique Integers

    list.stream().filter(x -> set.add(x)).forEach(x -> System.out.println(x));

    // It will give Duplicate Integers

    list.stream().filter(x -> !set.add(x)).collect(Collectors.toSet()).forEach(x -> System.out.println(x));
  }
}
