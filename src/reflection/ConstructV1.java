package reflection;

import java.lang.reflect.Constructor;

public class ConstructV1 {

  public static void main(String[] args) throws ClassNotFoundException {
    Class<?> basicData = Class.forName("reflection.data.BasicData");

    System.out.println("==== constructs() ====");
    Constructor<?>[] constructors = basicData.getConstructors();
    for (Constructor<?> constructor : constructors) {
      System.out.println("constructor = " + constructor);
    }

    System.out.println("==== declaredConstructs() ====");
    Constructor<?>[] declaredConstructors = basicData.getDeclaredConstructors();
    for (Constructor<?> declaredConstructor : declaredConstructors) {
      System.out.println("declaredConstructor = " + declaredConstructor);
    }
  }
}
