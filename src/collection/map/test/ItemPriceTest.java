package collection.map.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class ItemPriceTest {

  public static void main(String[] args) {
    Map<String, Integer> map = Map.of("사과", 500, "바나나", 500, "망고", 1000, "딸기", 1000);

    Set<String> productSet = new HashSet<>();
    for (String product : map.keySet()) {
      if (map.get(product) == 1000) {
        productSet.add(product);
      }
    }
    System.out.println(productSet);
  }
}
