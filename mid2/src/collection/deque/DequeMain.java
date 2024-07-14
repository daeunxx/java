package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeMain {

  public static void main(String[] args) {
    Deque<Integer> deque = new ArrayDeque<>();

    //데이터 추가
    deque.addFirst(1);
    System.out.println(deque);

    deque.addFirst(2);
    System.out.println(deque);

    deque.addLast(3);
    System.out.println(deque);
    
    deque.addLast(4);
    System.out.println(deque);
    
    //다음 꺼낼 데이터 확인(단순 조회만)
    System.out.println("deque.peekFirst() = " + deque.peekFirst());
    System.out.println("deque.peekLast() = " + deque.peekLast());
    
    //데이터 꺼내기
    System.out.println("deque.pollFirst() = " + deque.pollFirst());
    System.out.println("deque.pollFirst() = " + deque.pollFirst());
    System.out.println("deque.pollLast() = " + deque.pollLast());
    System.out.println("deque.pollLast() = " + deque.pollLast());
  }
}
