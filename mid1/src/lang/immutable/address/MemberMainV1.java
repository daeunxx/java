package lang.immutable.address;

public class MemberMainV1 {

  public static void main(String[] args) {
    Address address = new Address("서울");
    MemberV1 member1 = new MemberV1("회원1", address);
    MemberV1 member2 = new MemberV1("회원2", address);

    //회원1, 회원2의 처음 주소는 모두 서울
    System.out.println("member1 = " + member1);
    System.out.println("member2 = " + member2);

    //회원2의 주소 변경
    member2.getAddress().setValue("경기");
    System.out.println("member2.address -> 경기");
    System.out.println("member1 = " + member1);
    System.out.println("member2 = " + member2);
  }
}
