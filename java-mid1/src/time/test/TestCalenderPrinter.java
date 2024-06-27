package time.test;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.TemporalAdjusters;
import java.util.Scanner;

public class TestCalenderPrinter {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("년도를 입력하세요: ");
    int year = scanner.nextInt();

    System.out.print("월을 입력하세요: ");
    int month = scanner.nextInt();

    System.out.println("year = " + year);
    System.out.println("month = " + month);

    printCalender(year, month);
  }

  static void printCalender(int year, int month) {
    LocalDate firstDay = LocalDate.of(year, month, 1);
    LocalDate lastDay = firstDay.with(TemporalAdjusters.lastDayOfMonth());

    int offSetWeekdays = firstDay.getDayOfWeek().getValue() % 7;
    System.out.println("offSetWeekdays = " + offSetWeekdays);

    System.out.println("Su Mo Tu We Th Fr Sa");

    for (int i = 0; i < offSetWeekdays; i++) {
      System.out.print("   ");
    }

    while (true) {
      System.out.printf("%2d ", firstDay.getDayOfMonth());
      if (firstDay.isEqual(lastDay)) {
        break;
      }
      if (firstDay.getDayOfWeek() == DayOfWeek.SATURDAY) {
        System.out.println();
      }
        firstDay = firstDay.plusDays(1);
    }
  }
}
