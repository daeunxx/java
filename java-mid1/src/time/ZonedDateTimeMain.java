package time;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeMain {

  public static void main(String[] args) {
    ZonedDateTime nowZdt = ZonedDateTime.now();
    System.out.println("nowZdt = " + nowZdt);

    LocalDateTime ldt = LocalDateTime.of(2023, 1, 1, 10, 10, 10);
    ZonedDateTime zdt1 = ZonedDateTime.of(ldt, ZoneId.of("Asia/Seoul"));
    System.out.println("zdt1 = " + zdt1);

    ZonedDateTime zdt2 = ZonedDateTime.of(2024, 1, 1, 10, 10, 30, 0, ZoneId.of("Asia/Seoul"));
    System.out.println("zdt2 = " + zdt2);

    ZonedDateTime utcZdt = zdt2.withZoneSameInstant(ZoneId.of("UTC"));
    System.out.println("utcZdt = " + utcZdt);
  }
}
