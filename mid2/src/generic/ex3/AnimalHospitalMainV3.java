package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {

  public static void main(String[] args) {
    AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3();
    AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3();
    //AnimalHospitalV3<Integer> integerHospital = new AnimalHospitalV3<Integer>();

    Dog dog = new Dog("멍멍이", 100);
    Cat cat = new Cat("냐옹이", 300);

    dogHospital.setAnimal(dog);
    dogHospital.checkup();

    catHospital.setAnimal(cat);
    catHospital.checkup();

    //문제1: 개 병원에 고양이 전달
    //dogHospital.setAnimal(cat); //다른 타입 입력: 컴파일 오류

    //문제2: 개 타입 반환
    Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
    System.out.println("biggerDog = " + biggerDog);
  }
}
