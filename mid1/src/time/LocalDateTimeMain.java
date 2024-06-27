package time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeMain {

  public static void main(String[] args) {
    LocalDateTime nowDateTime = LocalDateTime.now();
    System.out.println("현재 날짜 시간: " + nowDateTime);

    LocalDateTime ofDateTime = LocalDateTime.of(2023, 8, 16, 9, 0, 20);
    System.out.println("지정 날짜 시간: " + ofDateTime);

    //날짜와 시간 분리
    LocalDate localDate = ofDateTime.toLocalDate();
    LocalTime localTime = ofDateTime.toLocalTime();
    System.out.println("localDate = " + localDate);
    System.out.println("localTime = " + localTime);

    //날짜와 시간 합체
    LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);
    System.out.println("localDateTime = " + localDateTime);

    //계산
    ofDateTime = ofDateTime.plusDays(1000);
    System.out.println("지정 날짜 시간 + 1000d: " + ofDateTime);

    ofDateTime = ofDateTime.plusYears(1);
    System.out.println("지정 날짜 시간 + 1y: " + ofDateTime);

    //비교
    System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이전인가? " + nowDateTime.isBefore(ofDateTime));
    System.out.println("현재 날짜 시간이 지정 날짜 시간보다 이후인가? " + nowDateTime.isAfter(ofDateTime));
    System.out.println("현재 날짜 시간이 지정 날짜 시간보다 같은가? " + nowDateTime.isEqual(ofDateTime));
  }
}
