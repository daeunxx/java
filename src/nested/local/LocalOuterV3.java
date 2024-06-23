package nested.local;

import java.lang.reflect.Field;

public class LocalOuterV3 {

  private int outInstanceValue = 3;

  public Printer process(int paramValue) {
    //지역 변수는 스택 프레임이 종료되는 순간 제거
    int localValue = 1;

    class LocalPrinter implements Printer {

      int value = 0;
      //지역변수 캡쳐
      //int localValue = 1;
      //int paramValue = 2;

      @Override
      public void print() {
        System.out.println("value = " + value);
        System.out.println("localValue = " + localValue);
        System.out.println("paramValue = " + paramValue);
        System.out.println("outInstanceValue = " + outInstanceValue);
      }
    }

    LocalPrinter printer = new LocalPrinter();
    return printer;
  }

  public static void main(String[] args) {
    LocalOuterV3 localOuter = new LocalOuterV3();
    Printer printer = localOuter.process(2);
    //process()의 스택이 사라진 후(paramValue, localValue 모두 사라짐)에 실행
    printer.print();

    System.out.println("필드 확인");
    Field[] fields = printer.getClass().getDeclaredFields();
    for (Field field : fields) {
      System.out.println("field = " + field);
    }
  }
}
