package thread.executor.reject;

import static util.MyLogger.log;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import thread.executor.RunnableTask;

public class RejectMainV1 {

  public static void main(String[] args) {
    //ThreadPoolExecutor.AbortPolicy default
    ExecutorService es = new ThreadPoolExecutor(1, 1, 0,
        TimeUnit.SECONDS, new SynchronousQueue<>(), new ThreadPoolExecutor.AbortPolicy());

    es.execute(new RunnableTask("task1"));
    try {
      es.execute(new RunnableTask("task2"));
    } catch (RejectedExecutionException e) {
      log("요청 초과");
      //포기, 다시 시도 등 선택
      log(e);
    }

    es.close();
  }
}
