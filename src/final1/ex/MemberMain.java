package final1.ex;

public class MemberMain {

  public static void main(String[] args) {
    Member member = new Member("myId", "daeun");
    member.print();
    member.changeData("danna");
    member.print();
  }
}
