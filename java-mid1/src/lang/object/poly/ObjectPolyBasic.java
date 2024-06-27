package lang.object.poly;

public class ObjectPolyBasic {

  public static void main(String[] args) {
    Dog dog = new Dog();
    Car car = new Car();

    action(dog);
    action(car);
  }

  private static void action(Object object) {

    // 객체에 맞게 다운캐스팅
    if (object instanceof Dog dog) {
      dog.sound();
    } else if (object instanceof Car car) {
      car.move();
    }
  }

}
