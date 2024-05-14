package ref.ex;

import java.util.Scanner;

public class ProductOrderMain2 {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    System.out.print("입력할 주문의 개수를 입력하세요: ");
    int n = scanner.nextInt();

    ProductOrder[] orders = createOrders(n);

    printOrders(orders);
    int totalAmount = getTotalAmount(orders);
    System.out.println("총 결제 금액: " + totalAmount);
  }

  static ProductOrder[] createOrders(int n) {

    ProductOrder[] orders = new ProductOrder[n];
    Scanner scanner = new Scanner(System.in);

    for (int i = 0; i < n; i++) {
      orders[i] = new ProductOrder();
      System.out.println((i + 1) + "번째 주문 정보를 입력하세요.");

      System.out.print("상품명: ");
      orders[i].productName = scanner.nextLine();

      System.out.print("가격: ");
      orders[i].price = scanner.nextInt();

      System.out.print("수량: ");
      orders[i].quantity = scanner.nextInt();
      scanner.nextLine(); //입력 버퍼 비우기
    }
    return orders;
  }

  static void printOrders(ProductOrder[] orders) {
    for (ProductOrder order : orders) {
      System.out.println(
          "상품명: " + order.productName + ", 가격: " + order.price + ", 수량: " + order.quantity);
    }
  }

  static int getTotalAmount(ProductOrder[] orders) {
    int totalAmount = 0;
    for (ProductOrder order : orders) {
      totalAmount += order.quantity * order.price;
    }
    return totalAmount;
  }
}
