package lang.string.method;

public class StringChangeMain2 {

  public static void main(String[] args) {
    String strWithSpaces = "    Java Programming   ";

    System.out.println("strWithSpaces.toLowerCase() = " + strWithSpaces.toLowerCase());
    System.out.println("strWithSpaces.toUpperCase() = " + strWithSpaces.toUpperCase());

    System.out.println("strWithSpaces.trim() = " + "'" + strWithSpaces.trim() + "'");
    System.out.println("strWithSpaces.strip() = " + "'" + strWithSpaces.strip() + "'");
    System.out.println("strWithSpaces.stripLeading() = " + "'" + strWithSpaces.stripLeading() + "'");
    System.out.println("strWithSpaces.stripTrailing() = " + "'" + strWithSpaces.stripTrailing() + "'");
  }
}
