package enumeration.test;

import java.util.Arrays;
import java.util.Scanner;

public class AuthGradeMain2 {

  public static void main(String[] args) {
    System.out.print("당신의 등급을 입력하세요 " + Arrays.toString(AuthGrade.values()) + ": ");
    Scanner scanner = new Scanner(System.in);
    AuthGrade authGrade = AuthGrade.valueOf(scanner.nextLine().toUpperCase());

    printAuthGrade(authGrade);
    printMenu(authGrade);
  }

  public static void printAuthGrade(AuthGrade authGrade) {
    System.out.println("당신의 등급은 " + authGrade.getDescription() + " 입니다.");
  }

  public static void printMenu(AuthGrade authGrade) {
    if (authGrade.getLevel() > 0) {
      System.out.println("==메뉴 목록==");
      System.out.println("- 메인 화면");
    }
    if (authGrade.getLevel() > 1) {
      System.out.println("- 이메일 관리 화면");
    }
    if (authGrade.getLevel() > 2) {
      System.out.println("- 관리자 화면");
    }
  }
}
