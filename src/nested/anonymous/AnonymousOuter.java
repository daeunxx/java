package nested.anonymous;

import nested.Printer;

public class AnonymousOuter {

  private int outInstanceValue = 3;

  public void process(int paramValue) {
    int localValue = 1;

    Printer printer = new Printer() {

      int value = 0;

      @Override
      public void print() {
        System.out.println("value = " + value);
        System.out.println("localValue = " + localValue);
        System.out.println("paramValue = " + paramValue);
        System.out.println("outInstanceValue = " + outInstanceValue);
      }
    };

    printer.print();
    System.out.println("printer.getClass() = " + printer.getClass());
  }

  public static void main(String[] args) {
    AnonymousOuter main = new AnonymousOuter();
    main.process(2);
  }
}
