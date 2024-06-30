package generic.ex1;

public class RowTypeMain {

  public static void main(String[] args) {
    GenericBox genericBox = new GenericBox();
    //GenericBox<Object> genericBox = new GenericBox<>(); //권장
    genericBox.set(10);
    Object result = genericBox.get();
    System.out.println("result = " + result);
  }
}
