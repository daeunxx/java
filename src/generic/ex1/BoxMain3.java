package generic.ex1;

public class BoxMain3 {

  public static void main(String[] args) {
    GenericBox<Integer> integerBox = new GenericBox<Integer>(); //생성 시점에 T의 타입 결정
    integerBox.set(10);
    //integerBox.set("문자 100"); //Integer 타입만 허용 -> 컴파일 오류
    Integer integerValue = integerBox.get();
    System.out.println("integerValue = " + integerValue);

    GenericBox<String> stringBox = new GenericBox<String>();
    stringBox.set("hello");
    String stringValue = stringBox.get();
    System.out.println("stringValue = " + stringValue);

    //원하는 모든 타입 사용 가능
    GenericBox<Double> doubleBox = new GenericBox<>();
    doubleBox.set(1.0);
    Double doubleValue = doubleBox.get();
    System.out.println("doubleValue = " + doubleValue);

    //타입 추론: 생성하는 제네릭 타입 생략 가능
    GenericBox<Integer> integerBox2 = new GenericBox<>();
  }
}
