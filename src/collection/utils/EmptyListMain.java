package collection.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class EmptyListMain {

  public static void main(String[] args) {
    //빈 가변 리스트 생성
    List<Integer> list1 = new ArrayList<>();
    List<Integer> list2 = new LinkedList<>();

    //빈 불변 리스트 생성
    List<Object> list3 = Collections.emptyList();
    List<Object> list4 = List.of();

    System.out.println("list3 = " + list3.getClass());
    System.out.println("list4 = " + list4.getClass());

    List<Integer> list5 = Arrays.asList(1, 2, 3);
    List<Integer> list6 = List.of(1, 2, 3);

    //Arrays.asList는 arr 참조값을 복사
    //arr가 매우 큰 크기가 아닌 이상 List.of 사용 권장
    Integer[] arr = {1, 2, 3, 4, 5};
    List<Integer> arrList = Arrays.asList(arr);

    System.out.println("arr = " + Arrays.toString(arr));
    System.out.println("arrList = " + arrList);

    arrList.set(0, 100);

    System.out.println("arr = " + Arrays.toString(arr));
    System.out.println("arrList = " + arrList);
  }
}
