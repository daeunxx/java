package com.helloShop.order;

import com.helloShop.product.Product;
import com.helloShop.user.User;

public class OrderService {

  public void order() {
    User user = new User();
    Product product = new Product();
    Order order = new Order(user, product);
  }
}
