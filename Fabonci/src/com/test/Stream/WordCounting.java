package com.test.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

// use to count the number of words repeated in a statement.
public class WordCounting {

  public static void main(String[] args) {
    String str = "I am here and I am here too";

      List<String> list = Arrays.asList(str.split(" "));

     Map<String,Long> map= list.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
    System.out.println(map);
  }
}
