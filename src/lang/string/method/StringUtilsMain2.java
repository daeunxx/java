package lang.string.method;

public class StringUtilsMain2 {

  public static void main(String[] args) {
    int num = 100;
    boolean bool = true;
    Object object = new Object();
    String str = "Hello, Java";

    //format 메서드
    String format1 = String.format("num: %d, bool: %b, str: %s", num, bool, str);
    System.out.println("num: %d, bool: %b, str: %s = " + format1);

    String format2 = String.format("소수 표현: %.2f", 10.12345);
    System.out.println("소수 표현: %.2f = " + format2);

    //printf
    System.out.printf("소수 표현: %.3f\n", 10.12345);

    //matches 메서드
    String regex = "Hello, (Java|World)";
    System.out.println("str.matches(regex) = " + str.matches(regex));
  }
}
