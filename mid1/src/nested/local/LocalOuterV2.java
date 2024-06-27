package nested.local;

import nested.Printer;

public class LocalOuterV2 {

  private int outInstanceValue = 3;

  public void process(int paramValue) {
    int localValue = 1;

    class LocalPrinter implements Printer {

      int value = 0;

      @Override
      public void print() {
        System.out.println("value = " + value);
        System.out.println("localValue = " + localValue);
        System.out.println("paramValue = " + paramValue);
        System.out.println("outInstanceValue = " + outInstanceValue);
      }
    }

    LocalPrinter printer = new LocalPrinter();
    printer.print();
  }

  public static void main(String[] args) {
    LocalOuterV2 localOuter = new LocalOuterV2();
    localOuter.process(2);
  }
}
