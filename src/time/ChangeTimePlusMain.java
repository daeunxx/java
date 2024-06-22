package time;

import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class ChangeTimePlusMain {

  public static void main(String[] args) {
    LocalDateTime ldt = LocalDateTime.of(2023, 1, 1, 10, 00, 00);
    System.out.println("ldt = " + ldt);

    LocalDateTime plusLdt1 = ldt.plus(10, ChronoUnit.YEARS);
    System.out.println("plusLdt1 = " + plusLdt1);

    LocalDateTime plusLdt2 = ldt.plusYears(10);
    System.out.println("plusLdt2 = " + plusLdt2);

    Period period = Period.ofYears(10);
    LocalDateTime plusLdt3 = ldt.plus(period);
    System.out.println("plusLdt3 = " + plusLdt3);
  }
}
