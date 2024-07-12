package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {

  public static void main(String[] args) {
    String text = "orange banana apple apple banana apple";
    String[] textArr = text.split(" ");
    Map<String, Integer> textMap = new HashMap<>();

    for (String t : textArr) {
      textMap.put(t, textMap.getOrDefault(t, 0) + 1);
    }
    System.out.println(textMap);
  }
}
