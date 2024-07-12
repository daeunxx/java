package collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class TaskScheduler {

  private Deque<Task> taskQueue = new ArrayDeque<>();

  public void addTask(Task task) {
    taskQueue.offer(task);
  }

  public int getRemainingTasks() {
    return taskQueue.size();
  }

  public void processNextTask() {
    if (!taskQueue.isEmpty()) {
      Task task = taskQueue.poll();
      task.execute();
    }
  }
}
