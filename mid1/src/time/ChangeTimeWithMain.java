package time;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class ChangeTimeWithMain {

  public static void main(String[] args) {
    LocalDateTime ldt = LocalDateTime.now();
    System.out.println("ldt = " + ldt);

    LocalDateTime changeLdt1 = ldt.with(ChronoField.YEAR, 2020);
    System.out.println("changeLdt1 = " + changeLdt1);

    LocalDateTime changeLdt2 = ldt.withYear(2020);
    System.out.println("changeLdt2 = " + changeLdt2);

    //TemporalAdjuster 사용
    //다음주 금요일
    LocalDateTime with1 = ldt.with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
    System.out.println("기준 날짜: " + ldt);
    System.out.println("다음주 금요일: " + with1);

    //이번달의 마지막 일요일
    LocalDateTime with2 = ldt.with(TemporalAdjusters.lastInMonth(DayOfWeek.SUNDAY));
    System.out.println("같은 달의 마지막 일요일: " + with2);
  }
}
