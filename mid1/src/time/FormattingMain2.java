package time;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormattingMain2 {

  public static void main(String[] args) {
    //포맷팅
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
    String formattedDateTime = now.format(formatter);
    System.out.println("now = " + now);
    System.out.println("formattedDateTime = " + formattedDateTime);

    //파싱
    String dateTime = "2024-06-30 09:00:30";
    LocalDateTime parsedDateTime = LocalDateTime.parse(dateTime, formatter);
    System.out.println("parsedDateTime = " + parsedDateTime);
  }
}
