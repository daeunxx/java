package poly.ex.pay;

public class PayStore {

  public static boolean findPay(String option, int amount) {
    Pay pay;

    if (option.equals("kakao")) {
      pay = new KakaoPay();
    } else if (option.equals("naver")) {
      pay = new NaverPay();
    } else {
      pay = new DefaultPay();
    }

    return pay.pay(amount);
  }
}
