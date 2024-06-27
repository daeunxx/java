package lang.wrapper;

public class WrapperVsPrimitive {

  public static void main(String[] args) {
    int iterations = 1_000_000_000; //반복 횟수 10억
    long startTime, endTime;

    //primitive
    long sumPrimitive = 0;
    startTime = System.currentTimeMillis();

    for (int i = 0; i < iterations; i++) {
      sumPrimitive += i;
    }

    endTime = System.currentTimeMillis();
    System.out.println("sumPrimitive = " + sumPrimitive);
    System.out.println("primitive long 실행 시간: " + (endTime - startTime) + "ms");

    //wrapper
    Long sumWrapper = 0L;
    startTime = System.currentTimeMillis();

    for (int i = 0; i < iterations; i++) {
      sumWrapper += i; //Auto-Boxing
    }

    endTime = System.currentTimeMillis();
    System.out.println("sumPrimitive = " + sumPrimitive);
    System.out.println("wrapper class Long 실행 시간: " + (endTime - startTime) + "ms");

  }
}
