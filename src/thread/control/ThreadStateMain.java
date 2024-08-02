package thread.control;

import static util.MyLogger.log;

public class ThreadStateMain {

  //main 스레드에서는 예외 던지기 가능
  public static void main(String[] args) throws InterruptedException {
    Thread thread = new Thread(new MyRunnable(), "myThread");
    log("myThread.state1 = " + thread.getState());
    log("myThread.start()");

    thread.start();
    Thread.sleep(1000);
    log("myThread.state3 = " + thread.getState());

    Thread.sleep(4000);
    log("myThread.state5 = " + thread.getState());
  }

  static class MyRunnable implements Runnable {

    //Runnable 부모 메서드에서 예외를 던지지 않기 때문에 예외 던지기 불가
    @Override
    public void run() {
      try {
        log("start");
        log("myThread.state2 = " + Thread.currentThread().getState());

        log("sleep() start");
        Thread.sleep(3000);
        log("sleep() end");

        log("myThread.state4 = " + Thread.currentThread().getState());
        log("end");
      } catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
