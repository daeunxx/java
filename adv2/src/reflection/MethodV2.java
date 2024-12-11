package reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import reflection.data.BasicData;

public class MethodV2 {

  public static void main(String[] args)
      throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
    BasicData basicDataInstance = new BasicData();

    // 정적 메서드 호출 - 일반적이 메서드 호출
    basicDataInstance.call();

    // 동적 메서드 호출
    Class<? extends BasicData> basicData = basicDataInstance.getClass();
    String methodName = "hello";

    Method method1 = basicData.getDeclaredMethod(methodName, String.class);
    System.out.println("method1 = " + method1);
    Object returnValue = method1.invoke(basicDataInstance, "hi");
    System.out.println("returnValue = " + returnValue);
  }
}
