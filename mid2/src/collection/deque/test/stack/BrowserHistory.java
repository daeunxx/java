package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;

public class BrowserHistory {

  private Deque<String> stack = new ArrayDeque<>();

  public void visitPage(String url) {
    System.out.println("방문: " + url);
    stack.push(url);
  }

  public String goBack() {
    if (!stack.isEmpty() && stack.pop() != null) {
      System.out.println("뒤로 가기: " + stack.peek());
      return stack.peek();
    }
    return null;
  }
}
