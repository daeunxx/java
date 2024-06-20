package lang.wrapper;

public class WrapperClassMain {

  public static void main(String[] args) {
    Integer newInteger = new Integer(10); //@Deprecated 예정
    System.out.println("newInteger = " + newInteger);

    Integer integerObj1 = Integer.valueOf(10); //-128 ~ 127 자주 사용하는 숫자 캐싱(숫자값 풀)
    System.out.println("integerObj1 = " + integerObj1);

    Long longObj = Long.valueOf(100);
    Double doubleObj = Double.valueOf(10.5);
    System.out.println("longObj = " + longObj);
    System.out.println("doubleObj = " + doubleObj);

    System.out.println("내부 값 읽기");
    int intValue = integerObj1.intValue();
    long longValue = longObj.longValue();

    System.out.println("비교");
    System.out.println("==: " + (newInteger == integerObj1));
    System.out.println("equals: " + (newInteger.equals(integerObj1)));

    Integer integerObj2 = Integer.valueOf(10);
    System.out.println("캐싱 값 ==: " + (integerObj1 == integerObj2));

    Integer integerObj3 = Integer.valueOf(10000);
    Integer integerObj4 = Integer.valueOf(10000);
    System.out.println("캐싱 값 ==: " + (integerObj3 == integerObj4));
  }
}
