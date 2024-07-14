package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {

  public static void main(String[] args) {
    AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
    AnimalHospitalV1 catHospital = new AnimalHospitalV1();

    Dog dog = new Dog("멍멍이", 100);
    Cat cat = new Cat("냐옹이", 300);

    dogHospital.setAnimal(dog);
    dogHospital.checkup();

    catHospital.setAnimal(cat);
    catHospital.checkup();

    //문제1: 개 병원에 고양이 전달
    dogHospital.setAnimal(cat); //매개변수 체크 실패: 컴파일 오류 발생X

    //문제2: 개 타입 반환, 캐스팅 필요
    Dog biggerDog = (Dog) dogHospital.bigger(new Dog("멍멍이2", 200));
    System.out.println("biggerDog = " + biggerDog);
  }
}
