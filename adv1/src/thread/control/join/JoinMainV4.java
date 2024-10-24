package thread.control.join;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class JoinMainV4 {

  public static void main(String[] args) throws InterruptedException {
    log("start");

    SumTask task = new SumTask(1, 50);
    Thread thread = new Thread(task, "Thread");

    thread.start();

    //스레드가 종료될 때까지 대기
    log("join(1000) - main 스레드가 thread 종료까지 1초 대기");
    thread.join(1000); //대상 스레드가 TERMINATED 될 때까지 대기
    log("main 스레드 대기 완료");

    log("task.result = " + task.result);
    log("end");
  }

  static class SumTask implements Runnable {

    int startValue;
    int endValue;
    int result;

    public SumTask(int startValue, int endValue) {
      this.startValue = startValue;
      this.endValue = endValue;
    }

    @Override
    public void run() {
      log("작업 시작");
      sleep(2000);

      int sum = 0;
      for (int i = startValue; i <= endValue; i++) {
        sum += i;
      }
      result = sum;

      log("작업 완료 result = " + result);
    }
  }
}
