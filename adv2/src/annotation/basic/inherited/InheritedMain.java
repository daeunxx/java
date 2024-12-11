package annotation.basic.inherited;

import java.lang.annotation.Annotation;

public class InheritedMain {

  public static void main(String[] args) {
    printAnnotation(Parent.class);
    printAnnotation(Child.class);
    printAnnotation(TestInterface.class);
    printAnnotation(TestInterfaceImpl.class);
  }

  private static void printAnnotation(Class<?> clazz) {
    System.out.println("clazz = " + clazz);
    for (Annotation annotation : clazz.getAnnotations()) {
      System.out.println(" - " + annotation.annotationType().getSimpleName());
    }
    System.out.println();
  }
}
