package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    List<Integer> list = new ArrayList<>();
    int sum = 0;

    System.out.println("n개의 정수를 입력하세요 (종료 0)");

    while (true) {
      int input = scanner.nextInt();
      if (input == 0) {
        break;
      }
      list.add(input);
    }

    for (int i = 0; i < list.size(); i++) {
      sum += list.get(i);
    }

    System.out.println("입력된 정수의 합계: " + sum);
    System.out.println("입력된 정수의 평균: " + (double) (sum / list.size()));
  }
}
