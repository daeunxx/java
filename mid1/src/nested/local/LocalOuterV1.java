package nested.local;

public class LocalOuterV1 {

  private int outInstanceValue = 3;

  public void process(int paramValue) {
    int localValue = 1;

    class LocalPrinter {

      int value = 0;

      public void printData() {
        System.out.println("value = " + value);
        System.out.println("localValue = " + localValue);
        System.out.println("paramValue = " + paramValue);
        System.out.println("outInstanceValue = " + outInstanceValue);
      }
    }

    LocalPrinter printer = new LocalPrinter();
    printer.printData();
  }

  public static void main(String[] args) {
    LocalOuterV1 localOuter = new LocalOuterV1();
    localOuter.process(2);
  }
}
