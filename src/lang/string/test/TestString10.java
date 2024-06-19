package lang.string.test;

public class TestString10 {

  public static void main(String[] args) {
    String fruits = "apple,banana,mango";
    String[] splitFruit = fruits.split(",");

    for (String fruit : splitFruit) {
      System.out.println(fruit);
    }

    System.out.println("joinedString = " + String.join("->", splitFruit));
  }
}
