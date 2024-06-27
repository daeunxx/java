package exception.basic.unchecked;

/**
 * 언체크 예외는 예외를 잡거나 던지지 않아도 됨
 * 예외를 잡지 않으면 자동으로 밖으로 던짐
 */
public class Service {

  Client client = new Client();

  public void callCatch() {

    //필요한 경우 예외 처리 가능
    try {
      client.call();
    } catch (MyUncheckedException e) {
      System.out.println("예외 처리, message = " + e.getMessage());
    }
    System.out.println("정상 로직");
  }

  /**
   * 예외를 잡지 않아도 됨(throws 선언을 하지 않아도 됨)
   * -> 자연스럽게 상위로 넘어감
   */
  public void callThrow() {
    client.call();
  }
}
