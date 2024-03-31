package lang.object.poly;

public class ObjectPolyExample1 {

  public static void main(String[] args) {
    Dog dog = new Dog();
    Car car = new Car();

    actioin(dog);
    actioin(car);
  }

  private static void actioin(Object object) {

    // 객체에 맞게 다운캐스팅
    if (object instanceof  Dog dog) {
      dog.sound();
    } else if (object instanceof Car car) {
      car.move();
    }
  }

}
