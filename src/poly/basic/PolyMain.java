package poly.basic;

public class PolyMain {

  public static void main(String[] args) {
    //부모 변수가 부모 인스턴스 참조
    System.out.println("Parent -> Parent");
    Parent parent = new Parent();
    parent.parentMethod();

    //자식 변수가 자식 인스턴스 참조
    System.out.println("Child -> Child");
    Child child = new Child();
    child.parentMethod();
    child.childMethod();

    //부모 변수가 자식 인스턴스 참조
    System.out.println("Parent -> Child");
    Parent poly = new Child();
    poly.parentMethod();

    //Child child1 = new Parent(); //자식은 부모를 담을 수 없음

    //poly.childMethod(); //자식의 기능 호출 불가, 컴파일 오류 발생
  }
}
