package lang.string.method;

public class StringSplitJoinMain {

  public static void main(String[] args) {
    String str = "Apple,Banana,Orange";

    //split()
    String[] splitStr = str.split(",");
    for (String s : splitStr) {
      System.out.println(s);
    }

    //각각의 문자열 연결 join()
    System.out.println(
        "String.join(\"-\", \"A\", \"B\", \"C\") = " + String.join("-", "A", "B", "C"));

    //문자열 배열 연결 join()
    System.out.println("String.join(\"-\", splitStr) = " + String.join("-", splitStr));
  }
}
