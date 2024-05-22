package poly.ex4;

public class Cat extends AbstractAnimal {

  @Override
  public void sound() {
    System.out.println("냥냥");
  }

  @Override
  public void move() {
    System.out.println("고양이 이동");
  }
}
