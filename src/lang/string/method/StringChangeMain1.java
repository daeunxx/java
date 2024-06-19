package lang.string.method;

public class StringChangeMain1 {

  public static void main(String[] args) {
    String str = "Hello, Java! Welcome to Java";

    System.out.println("str.substring(7) = " + str.substring(7));
    System.out.println("str.substring(7, 12) = " + str.substring(7, 12));

    System.out.println("str.concat(\"!!!\") = " + str.concat("!!!"));
    System.out.println("str + \"!!!\" = " + str + "!!!");

    System.out.println("str.replace(\"Java\", \"World\") = " + str.replace("Java", "World"));
    System.out.println(
        "str.replaceFirst(\"Java\", \"World\") = " + str.replaceFirst("Java", "World"));
  }
}
