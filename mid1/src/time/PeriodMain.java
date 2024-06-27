package time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class PeriodMain {

  public static void main(String[] args) {
    Period period = Period.ofDays(10);
    System.out.println("period = " + period);

    LocalDate currentDate = LocalDate.now();
    LocalDate plusDate = currentDate.plus(period);
    System.out.println("currentDate = " + currentDate);
    System.out.println("plusDate = " + plusDate);

 /*
    LocalTime currentTime = LocalTime.now();
    LocalTime plusTime = currentTime.plus(period); //UnsupportedTemporalTypeException
    System.out.println("currentTime = " + currentTime);
    System.out.println("plusTime = " + plusTime);
*/

    //기간 차이
    LocalDate startDate = LocalDate.of(2024, 1, 1);
    LocalDate endDate = LocalDate.of(2024, 2, 3);
    Period between = Period.between(startDate, endDate);
    System.out.println("기간: " + between.getMonths() + "개월 " + between.getDays() + "일");
  }
}
