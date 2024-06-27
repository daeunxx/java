package lang.system;

import java.util.Arrays;

public class SystemMain {

  public static void main(String[] args) {
    //현재 시간(밀리초)
    long currentTimeMillis = System.currentTimeMillis();
    System.out.println("currentTimeMillis = " + currentTimeMillis);

    //현재 시간(나노초)
    long currentTimeNano = System.nanoTime();
    System.out.println("currentTimeNano = " + currentTimeNano);
    
    //환경 변수(OS)
    System.out.println("System.getenv() = " + System.getenv());
    
    //시스템 속성(자바)
    System.out.println("System.getProperties() = " + System.getProperties());
    System.out.println(
        "System.getProperty(\"java.version\") = " + System.getProperty("java.version"));
    
    //배열 고속 복사
    char[] originalArr = {'h', 'e', 'l', 'l', 'o'};
    char[] copiedArr = new char[5];
    System.arraycopy(originalArr, 1, copiedArr, 0, 4);
    System.out.println("Arrays.toString(copiedArr) = " + Arrays.toString(copiedArr));

    //프로그램 종료
    System.exit(0);
    System.out.println("hello");
  }
}
