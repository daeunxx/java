package thread.start;

public class HelloRunnableMain {

  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName() + ": main() start");

    //스레드와 실행할 작업 분리
    HelloRunnable runnable = new HelloRunnable();
    Thread thread = new Thread(runnable);
    thread.start();

    System.out.println(Thread.currentThread().getName() + ": main() end");
  }
}
