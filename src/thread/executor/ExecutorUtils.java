package thread.executor;

import static util.MyLogger.log;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;

public class ExecutorUtils {

  public static void printState(ExecutorService executorService) {
    if (executorService instanceof ThreadPoolExecutor poolExecutor) {
      int poolSize = poolExecutor.getPoolSize();
      int activeCount = poolExecutor.getActiveCount();
      int queuedSize = poolExecutor.getQueue().size();
      long completedTaskCount = poolExecutor.getCompletedTaskCount();

      log("[poolSize=" + poolSize + ", activeCount=" + activeCount +
          ", queuedSize=" + queuedSize + ", completedTaskCount=" + completedTaskCount + "]");
    } else {
      log(executorService);
    }
  }
}
