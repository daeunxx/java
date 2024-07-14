package collection.map.test.cart;

import java.util.Objects;

public class Product {

  public Product(String name, int price) {
    this.name = name;
    this.price = price;
  }

  private String name;
  private int price;

  @Override
  public boolean equals(Object object) {
    if (this == object) {
      return true;
    }
    if (object == null || getClass() != object.getClass()) {
      return false;
    }
    Product product = (Product) object;
    return price == product.price && Objects.equals(name, product.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, price);
  }

  @Override
  public String toString() {
    return "Product{" +
        "name='" + name + '\'' +
        ", price=" + price +
        '}';
  }
}
