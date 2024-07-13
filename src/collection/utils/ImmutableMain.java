package collection.utils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ImmutableMain {

  public static void main(String[] args) {
    //불변 리스트 생성
    List<Integer> list = List.of(1, 2, 3);
    
    //불변 리스트 -> 가변 리스트
    List<Integer> mutableList = new ArrayList<>(list);
    mutableList.add(4);
    System.out.println("mutableList = " + mutableList);

    System.out.println("list.getClass() = " + list.getClass());
    System.out.println("mutableList.getClass() = " + mutableList.getClass());
    
    //가변 리스트 -> 불변 리스트
    List<Integer> immutableList = Collections.unmodifiableList(mutableList);
    System.out.println("immutableList = " + immutableList);
    System.out.println("immutableList.getClass() = " + immutableList.getClass());
  }
}
