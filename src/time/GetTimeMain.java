package time;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class GetTimeMain {

  public static void main(String[] args) {
    LocalDateTime ldt = LocalDateTime.of(2024, 6, 18, 9, 00, 00);
    System.out.println("YEAR = " + ldt.get(ChronoField.YEAR));
    System.out.println("MONTH_OF_YEAR = " + ldt.get(ChronoField.MONTH_OF_YEAR));
    System.out.println("DAY_OF_MONTH = " + ldt.get(ChronoField.DAY_OF_MONTH));
    System.out.println("HOUR_OF_DAY = " + ldt.get(ChronoField.HOUR_OF_DAY));
    System.out.println("MINUTE_OF_HOUR = " + ldt.get(ChronoField.MINUTE_OF_HOUR));
    System.out.println("SECOND_OF_MINUTE = " + ldt.get(ChronoField.SECOND_OF_MINUTE));

    System.out.println("편의 메서드 제공");
    System.out.println("YEAR = " + ldt.getYear());
    System.out.println("MONTH_OF_YEAR = " + ldt.getMonthValue());
    System.out.println("DAY_OF_MONTH = " + ldt.getDayOfMonth());
    System.out.println("HOUR_OF_DAY = " + ldt.getHour());
    System.out.println("MINUTE_OF_HOUR = " + ldt.getMinute());
    System.out.println("SECOND_OF_MINUTE = " + ldt.getSecond());

    System.out.println("편의 메서드에 없음");
    System.out.println("MINUTE_OF_DAY = " + ldt.get(ChronoField.MINUTE_OF_DAY));
    System.out.println("SECOND_OF_DAY = " + ldt.get(ChronoField.SECOND_OF_DAY));
  }
}
