package lang.immutable.address;

public class MemberMainV2 {

  public static void main(String[] args) {
    ImmutableAddress address = new ImmutableAddress("서울");
    MemberV2 member1 = new MemberV2("회원1", address);
    MemberV2 member2 = new MemberV2("회원2", address);

    //회원1, 회원2의 처음 주소는 모두 서울
    System.out.println("member1 = " + member1);
    System.out.println("member2 = " + member2);

    //회원2의 주소 변경
    //member2.getAddress().setValue("경기"); //컴파일 오류
    member2.setAddress(new ImmutableAddress("경기"));
    System.out.println("member2.address -> 경기");
    System.out.println("member1 = " + member1);
    System.out.println("member2 = " + member2);
  }
}
