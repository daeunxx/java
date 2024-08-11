package thread.start;

public class HelloThreadMain {

  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName() + ": main() start");

    HelloThread helloThread = new HelloThread();
    System.out.println(Thread.currentThread().getName() + ": start() 호출 전");
    //start()를 호출하면 스택 공간 할당 후, 해당 스레드의 run() 호출 -> run() 직접 사용 금지
    helloThread.start();
    System.out.println(Thread.currentThread().getName() + ": start() 호출 후");

    System.out.println(Thread.currentThread().getName() + ": main() end");
  }
}
