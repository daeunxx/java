package generic.ex4;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class MethodMain2 {

  public static void main(String[] args) {
    Dog dog = new Dog("멍멍이", 100);
    Cat cat = new Cat("냐옹이", 50);

    AnimalMethod.checkup(dog);
    AnimalMethod.checkup(cat);

    Dog targetDob = new Dog("큰 멍멍이", 200);
    Dog biggerDog = AnimalMethod.bigger(dog, targetDob);
    System.out.println("biggerDog = " + biggerDog);

    Animal biggerAnimal = AnimalMethod.bigger(targetDob, cat);
    System.out.println("biggerAnimal = " + biggerAnimal);
  }
}
