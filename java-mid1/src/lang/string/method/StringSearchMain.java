package lang.string.method;

public class StringSearchMain {

  public static void main(String[] args) {
    String str = "Hello, Java! Welcome to Java World";
    
    System.out.println("str.contains(\"Java\") = " + str.contains("Java"));
    System.out.println("str.indexOf(\"Java\") = " + str.indexOf("Java"));
    System.out.println("str.indexOf(\"Java\", 8) = " + str.indexOf("Java", 8));
    System.out.println("str.lastIndexOf(\"Java\") = " + str.lastIndexOf("Java"));
  }
}
