package time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class FormattingMain1 {

  public static void main(String[] args) {
    //포맷팅: 날짜 -> 문자
    LocalDate date = LocalDate.of(2024, 6, 18);
    System.out.println("date = " + date);
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy년 MM월 dd일", Locale.ENGLISH);
    String formattedDate = date.format(formatter);
    System.out.println("formattedDate = " + formattedDate);

    //파싱: 문자 -> 날짜
    String input = "2024년 06월 30일";
    LocalDate parsedDate = LocalDate.parse(input, formatter);
    System.out.println("parsedDate = " + parsedDate);
  }
}
