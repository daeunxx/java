package poly.ex6;

public class SoundFlyMain {

  public static void main(String[] args) {
    Dog dog = new Dog();
    Bird bird = new Bird();
    Chicken chicken = new Chicken();

    soundAnimal(dog);
    soundAnimal(bird);
    soundAnimal(chicken);

    flyAnimal(bird);
    flyAnimal(chicken);
  }

  private static void soundAnimal(AbstractAnimal abstractAnimal) {
    System.out.println("동물 소리 테스트 시작");
    abstractAnimal.sound();
    System.out.println("동물 소리 테스트 종료");
  }

  //Fly 인터페이스가 존재하면 사용 가능
  private static void flyAnimal(Fly fly) {
    System.out.println("날기 테스트 시작");
    fly.fly();
    System.out.println("날기 테스트 종료");
  }
}
