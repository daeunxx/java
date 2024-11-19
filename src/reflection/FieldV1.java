package reflection;

import java.lang.reflect.Field;
import reflection.data.BasicData;

public class FieldV1 {

  public static void main(String[] args) {
    Class<BasicData> basicData = BasicData.class;

    System.out.println("==== fields() ====");
    Field[] fields = basicData.getFields();
    for (Field field : fields) {
      System.out.println("field = " + field);
    }

    System.out.println("==== declaredFields() ====");
    Field[] declaredFields = basicData.getDeclaredFields();
    for (Field declaredField : declaredFields) {
      System.out.println("declaredField = " + declaredField);
    }
  }
}
