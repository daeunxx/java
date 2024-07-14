package collection.set.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest2 {

  public static void main(String[] args) {
    Set<Integer> set = new LinkedHashSet<>(List.of(30, 20, 20, 10, 10));

    Iterator<Integer> iterator = set.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }
  }
}
