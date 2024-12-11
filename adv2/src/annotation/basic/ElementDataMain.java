package annotation.basic;

import java.util.Arrays;

public class ElementDataMain {

  public static void main(String[] args) {
    Class<ElementData1> elementData1Class = ElementData1.class;
    AnnotationElement annotation = elementData1Class.getAnnotation(AnnotationElement.class);

    System.out.println("annotation.value() = " + annotation.value());
    System.out.println("annotation.count() = " + annotation.count());
    System.out.println("annotation.tags() = " + Arrays.toString(annotation.tags()));
  }
}
