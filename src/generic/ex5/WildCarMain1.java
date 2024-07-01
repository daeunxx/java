package generic.ex5;

import generic.animal.Cat;
import generic.animal.Dog;

public class WildCarMain1 {

  public static void main(String[] args) {
    Box<Object> objectBox = new Box<>();
    Box<Dog> dogBox = new Box<>();
    Box<Cat> catBox = new Box<>();

    dogBox.setValue(new Dog("멍멍이", 100));
    WildCardEx.printGenericV1(dogBox);
    WildCardEx.printGenericV2(dogBox);
    Dog dog = WildCardEx.printAndReturnGeneric(dogBox);
    System.out.println("dog = " + dog);
  }
}
