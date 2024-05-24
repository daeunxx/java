package oop1.ex;

public class RetangleMain {

  public static void main(String[] args) {
    Retangle retangle = new Retangle();
    retangle.width = 5;
    retangle.height = 8;

    retangle.calculateArea();
    retangle.calculatePerimeter();
    retangle.isSquare();
  }
}
