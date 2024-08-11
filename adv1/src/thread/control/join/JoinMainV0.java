package thread.control.join;

import static util.MyLogger.log;
import static util.ThreadUtils.*;

import util.ThreadUtils;

public class JoinMainV0 {

  public static void main(String[] args) {
    log("start");
    Thread thread1 = new Thread(new Job(), "Thread-1");
    Thread thread2 = new Thread(new Job(), "Thread-2");
    thread1.start();
    thread2.start();
    log("end");
  }

  static class Job implements Runnable {

    @Override
    public void run() {
      log("작업 시작");
      sleep(2000);
      log("작업 완료");
    }
  }
}