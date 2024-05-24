package poly.ex.pay;

public class PayService {

  public void processPay(String option, int amount) {

    System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

    if (PayStore.findPay(option, amount)) {
      System.out.println("결제가 성공했습니다.");
    } else {
      System.out.println("결제가 실패했습니다.");
    }
  }
}
