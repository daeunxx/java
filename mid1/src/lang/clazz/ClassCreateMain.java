package lang.clazz;

import java.lang.reflect.InvocationTargetException;

public class ClassCreateMain {

  public static void main(String[] args)
      throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
//    Class helloClass = Hello.class;
    Class helloClass = Class.forName("lang.clazz.Hello");

    Hello hello = (Hello) helloClass.getConstructor().newInstance();
    String result = hello.hello();
    System.out.println("hello = " + hello);
    System.out.println("result = " + result);
  }
}
