package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildCarMain1 {

  public static void main(String[] args) {
    Box<Object> objectBox = new Box<>();
    Box<Dog> dogBox = new Box<>();
    Box<Cat> catBox = new Box<>();

    dogBox.setValue(new Dog("멍멍이", 100));
    catBox.setValue(new Cat("냐옹이", 50));

    WildCardEx.printGenericV1(dogBox);
    WildCardEx.printWildCardV1(dogBox);

    WildCardEx.printGenericV2(dogBox);
    //WildCardEx.printWildCardV2(objectBox);

    Dog dog = WildCardEx.printAndReturnGeneric(dogBox);
    Cat cat = WildCardEx.printAndReturnGeneric(catBox);

    //와일드카드 함수는 캐스팅을 해야 함
    Cat catWildCard = (Cat) WildCardEx.printAndReturnWildCard(catBox);

    System.out.println("dog = " + dog);
    System.out.println("cat = " + cat);
    System.out.println("catWildCard = " + catWildCard);
  }
}
