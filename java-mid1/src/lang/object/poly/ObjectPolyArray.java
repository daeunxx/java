package lang.object.poly;

public class ObjectPolyArray {

  public static void main(String[] args) {

    Object[] objects = {new Dog(), new Car(), new Object()};
    size(objects);
  }

  private static void size(Object[] objects) {
    System.out.println("전달된 객체의 수: " + objects.length);
  }

}
