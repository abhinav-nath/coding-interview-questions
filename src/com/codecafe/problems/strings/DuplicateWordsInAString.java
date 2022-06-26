package com.codecafe.problems.strings;

import java.util.LinkedHashMap;
import java.util.Map;

/*
 * Find all duplicate words in a String
 */
public class DuplicateWordsInAString {

  public static void main(String[] args) {
    String str = "hello hello hello world hello this is a test test";

    String[] words = str.split(" ");

    Map<String, Integer> wordCountMap = new LinkedHashMap<>();

    for (int i = 0; i < words.length; i++)
      wordCountMap.merge(words[i], 1, Integer::sum); // Java 8 way!

    for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
      if (entry.getValue() > 1)
        System.out.println(entry.getKey() + " : " + entry.getValue());
    }
  }

}