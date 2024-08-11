package thread.control;

public class CheckedExceptionMain {

  public static void main(String[] args) throws Exception {
    throw new Exception();
  }

  static class CheckedRunnable implements Runnable {

    /*부모 메서드에서 체크 예외를 던지지 않기 때문에
    자식 메서드에서 체크 예외를 던질 수 없음
    런타임 예외는 가능*/
    @Override
    public void run() /*throws Exception*/ {
      //throw new Exception();
    }
  }
}
