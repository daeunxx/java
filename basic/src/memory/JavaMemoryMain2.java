package memory;

import static memory.JavaMemoryMain1.method2;

public class JavaMemoryMain2 {

  public static void main(String[] args) {
    System.out.println("main start");
    method1();
    System.out.println("main end");
  }

  static void method1() {
    System.out.println("method1 start");
    Data data1 = new Data(10);
    method2(data1);
    System.out.println("method1 end");
  }

  private static void method2(Data data) {
    System.out.println("method2 start");
    System.out.println("data.getValue() = " + data.getValue());
    System.out.println("method2 end");
  }
}