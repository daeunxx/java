package generic.test.ex3.unit;

public class Shuttle<T extends BioUnit> {

  private String name;
  private int hp;

  public String getName() {
    return name;
  }

  public int getHp() {
    return hp;
  }

  public void in(T t) {
    this.name = t.getName();
    this.hp = t.getHp();
  }

  public void showInfo() {
    System.out.println("이름: " + getName() + ", HP: " + getHp());
  }
}
