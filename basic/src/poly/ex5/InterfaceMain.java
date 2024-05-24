package poly.ex5;

import poly.ex4.AbstractAnimal;

public class InterfaceMain {

  public static void main(String[] args) {
    //인터페이스 생성 불가
    //InterfaceAnimal interfaceAnimal = new InterfaceAnimal();

    Dog dog = new Dog();
    Cat cat = new Cat();
    Cow cow = new Cow();

    soundAnimal(dog);
    soundAnimal(cat);
    soundAnimal(cow);

    moveAnimal(dog);
    moveAnimal(cat);
    moveAnimal(cow);
  }

  private static void soundAnimal(InterfaceAnimal interfaceAnimal) {
    System.out.println("동물 소리 테스트 시작");
    interfaceAnimal.sound();
    System.out.println("동물 소리 테스트 종료");
  }

  private static void moveAnimal(InterfaceAnimal interfaceAnimal) {
    System.out.println("동물 이동 테스트 시작");
    interfaceAnimal.sound();
    System.out.println("동물 이동 테스트 종료");
  }
}
