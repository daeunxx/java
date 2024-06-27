package lang.string.method;

public class StringUtilsMain1 {

  public static void main(String[] args) {
    int num = 100;
    boolean bool = true;
    Object object = new Object();
    String str = "Hello, Java";

    System.out.println("String.valueOf(num) = " + String.valueOf(num));
    System.out.println("String.valueOf(bool) = " + String.valueOf(bool));
    System.out.println("String.valueOf(object) = " + String.valueOf(object));

    //문자 + x => 문자
    String numString = "" + num;
    System.out.println("빈문자열 + num: " + numString);

    char[] charArray = str.toCharArray();
    for (char c : charArray) {
      System.out.print(c);
    }
  }
}
