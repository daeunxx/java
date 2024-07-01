package generic.ex3;

import generic.animal.Animal;

public class AnimalHospitalV2<T> {

  private T animal;

  public void setAnimal(T animal) {
    this.animal = animal;
  }

  public void checkup() {
    //T의 타입을 메서드 정의 시점에 알 수 없음 -> Object의 메서드만 사용 가능
    //컴파일 오류
    //System.out.println("동물 이름: " + animal.getName());
    //System.out.println("동물 크기: " + animal.getSize());

    animal.toString();
    animal.equals(null);
  }

  public T bigger(Animal target) {
    //컴파일 오류
    //return animal.getSize() > target.getSize() ? animal : target;
    return null;
  }
}
