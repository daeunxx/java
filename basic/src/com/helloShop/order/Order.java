package com.helloShop.order;

import com.helloShop.product.Product;
import com.helloShop.user.User;

public class Order {

  User user;
  Product product;

  public Order(User user, Product product) {
    this.user = user;
    this.product = product;
  }
}
