package time;

import java.time.LocalTime;

public class LocalTimeMain {

  public static void main(String[] args) {
    LocalTime nowTime = LocalTime.now();
    System.out.println("현재 시간: " + nowTime);

    LocalTime ofTime = LocalTime.of(22, 10, 30);
    System.out.println("지정 시간: " + ofTime);

    ofTime = ofTime.plusMinutes(50);
    System.out.println("지정 시간 + 50m: " + ofTime);
  }
}
