package time;

import java.time.LocalDate;

public class LocalDataMain {

  public static void main(String[] args) {
    LocalDate nowDate = LocalDate.now();
    System.out.println("오늘 날짜: " + nowDate);

    LocalDate ofDate = LocalDate.of(1996, 6, 18);
    System.out.println("지정 날짜: " + ofDate);

    ofDate = ofDate.plusDays(10);
    System.out.println("지정 날짜 + 10d: " + ofDate);
  }
}
