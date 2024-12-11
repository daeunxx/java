package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ConstructV2 {

  public static void main(String[] args)
      throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
    Class<?> basicData = Class.forName("reflection.data.BasicData");

    Constructor<?> constructor = basicData.getDeclaredConstructor(String.class);
    constructor.setAccessible(true);
    Object instance = constructor.newInstance("hi");
    System.out.println("instance = " + instance);

    Method method1 = basicData.getDeclaredMethod("call");
    method1.invoke(instance);
  }
}
