package thread.start;

public class HelloThread extends Thread {

  @Override
  public void run() {
    //현재 실행 중인 스레드명 조회
    System.out.println(Thread.currentThread().getName() + ": run()");
  }
}