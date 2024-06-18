package lang.immutable.address;

public class RefMain1_3 {

  public static void main(String[] args) {
    //참조형 변수는 하나의 인스턴스 공유
    Address address1 = new Address("서울");
    Address address2 = address1;
    System.out.println("address1 = " + address1);
    System.out.println("address2 = " + address2);

    change(address2, "경기");
    System.out.println("address1 = " + address1);
    System.out.println("address2 = " + address2);
  }

  private static void change(Address address, String changeAddress) {
    System.out.println("주소 값 변경 -> " + changeAddress);
    address.setValue(changeAddress);
  }
}
