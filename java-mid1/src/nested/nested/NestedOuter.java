package nested.nested;

public class NestedOuter {

  private static int outClassValue = 3;
  private int outInstanceValue = 2;

  static class Nested {

    private int nestedInstanceValue = 1;

    public void print() {
      //자신의 멤버에 접근
      System.out.println("nestedInstanceValue = " + nestedInstanceValue);
      
      //바깥 클래스 인스턴스 멤버 접근 불가
      //System.out.println("outInstanceValue = " + outInstanceValue);
      
      //바깥 클래스의 클래스 멤버 접근 가능(private으로 선언되어도 접근 가능)
      System.out.println("outClassValue = " + outClassValue);
    }
  }
}
