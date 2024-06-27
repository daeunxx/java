package lang.wrapper;

public class WrapperUtilsMain {

  public static void main(String[] args) {
    Integer i1 = Integer.valueOf(10); // 숫자 -> wrapper
    Integer i2 = Integer.valueOf("10"); // 문자 -> wrapper
    int intValue = Integer.parseInt("10"); //문자 -> primitive

    //비교
    int compareResult = i1.compareTo(20);
    System.out.println("compareResult = " + compareResult);

    //산술 연산
    System.out.println("Integer.sum(10, 20) = " + Integer.sum(10, 20));
    System.out.println("Integer.min(10, 20) = " + Integer.min(10, 20));
    System.out.println("Integer.max(10, 20) = " + Integer.max(10, 20));
  }
}
