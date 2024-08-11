package thread.executor.reject;

import static util.MyLogger.log;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import thread.executor.RunnableTask;

public class RejectMainV4 {

  public static void main(String[] args) {
    ExecutorService es = new ThreadPoolExecutor(1, 1, 0,
        TimeUnit.SECONDS, new SynchronousQueue<>(), new MyRejectedExecutionHandler());

    es.execute(new RunnableTask("task1"));
    es.execute(new RunnableTask("task2"));
    es.execute(new RunnableTask("task3"));

    es.close();
  }

  static class MyRejectedExecutionHandler implements RejectedExecutionHandler {

    static AtomicInteger count = new AtomicInteger();

    @Override
    public void rejectedExecution(Runnable r, ThreadPoolExecutor executor) {
      int rejectedCount = count.incrementAndGet();
      log("[경고] 거절된 누적 작업 수: " + rejectedCount);
    }
  }
}
