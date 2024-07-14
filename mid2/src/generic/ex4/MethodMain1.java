package generic.ex4;

public class MethodMain1 {

  public static void main(String[] args) {
    Integer i = 10;
    Integer result = (Integer) GenericMethod.objMethod(i); //다운캐스팅
    
    //Type Argument 명시적 전달
    System.out.println("Type Argument 명시적 전달");
    Integer integerResult1 = GenericMethod.<Integer>genericMethod(i);
    Double doubleResult1 = GenericMethod.<Double>numberMethod(20.0);
    String stringResult1 = GenericMethod.<String>genericMethod("hello");

    //타입 추론 가능
    Integer integerResult2 = GenericMethod.genericMethod(i);
    Double doubleResult2 = GenericMethod.genericMethod(20.0);
    String stringResult2 = GenericMethod.genericMethod("hello");
  }
}
