package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {

  private Map<Product, Integer> cartMap = new HashMap<>();

  public void add(Product product, int quantity) {
    Integer existingQuantity = cartMap.getOrDefault(product, 0);
    cartMap.put(product, existingQuantity + quantity);
  }

  public void minus(Product product, int quantity) {
    Integer existingQuantity = cartMap.getOrDefault(product, 0);

    if (existingQuantity <= quantity) {
      cartMap.remove(product);
    } else {
      cartMap.replace(product, existingQuantity - quantity);
    }
  }

  public void printAll() {
    System.out.println("==모든 상품 출력==");
    for (Product key : cartMap.keySet()) {
      System.out.println("상품: " + key + " 수량: " + cartMap.get(key));
    }
  }
}
