package extends1.access.parent;

public class Parent {

  private int privateValue;
  int defaultValue;
  protected int protectedValue;
  public int publicValue;

  private void privateMethod() {
    System.out.println("Parent.privateMethod");
  }

  void defaultMethod() {
    System.out.println("Parent.defaultMethod");
  }

  protected void protectedMethod() {
    System.out.println("Parent.protectedMethod");
  }

  public void publicMethod() {
    System.out.println("Parent.publicMethod");
  }

  public void printParent() {
    System.out.println("printParent 메서드");
    System.out.println("privateValue = " + privateValue);
    System.out.println("defaultValue = " + defaultValue);
    System.out.println("protectedValue = " + protectedValue);
    System.out.println("publicValue = " + publicValue);

    //부모 메서드 안에서 모두 접근 가능
    privateMethod();
    defaultMethod();
  }

}
