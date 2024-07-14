package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeQueueMain {

  public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>();

    deque.add(1);
    deque.add(2);
    deque.add(3);
    System.out.println(deque);

    //다음 꺼낼 데이터 확인(단순 조회만)
    System.out.println("deque.peek() = " + deque.peek());

    //데이터 꺼내기
    System.out.println("deque.poll() = " + deque.poll());
    System.out.println("deque.poll() = " + deque.poll());
    System.out.println("deque.poll() = " + deque.poll());
    System.out.println(deque);
  }
}
