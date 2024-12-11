package util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class MyLogger {

  private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern(
      "yyyy-MM-dd HH:mm:ss");

  public static void log(Object object) {
    String time = LocalDateTime.now().format(formatter);
    System.out.printf("%s [%9s] %s\n", time, Thread.currentThread().getName(), object);
  }
}