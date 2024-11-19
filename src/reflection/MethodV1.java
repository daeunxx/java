package reflection;

import java.lang.reflect.Method;
import reflection.data.BasicData;

public class MethodV1 {

  public static void main(String[] args) {
    Class<BasicData> basicData = BasicData.class;

    System.out.println("==== methods() ====");
    Method[] methods = basicData.getMethods();
    for (Method method : methods) {
      System.out.println("method = " + method);
    }

    System.out.println("==== declaredMethods() ====");
    Method[] declaredMethods = basicData.getDeclaredMethods();
    for (Method declaredMethod : declaredMethods) {
      System.out.println("declaredMethod = " + declaredMethod);
    }
  }
}
