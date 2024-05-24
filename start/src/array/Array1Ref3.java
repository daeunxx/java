package array;

import java.util.Arrays;

public class Array1Ref3 {

    public static void main(String[] args) {
        int[] students = {90, 80, 70, 60, 50, 40, 30, 20, 10}; // 배열 생성과 초기화
//        int[] students = new int[]{90, 80, 70, 50, 40}; // 배열 생성과 초기화

        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i + 1) + " 점수 : " + students[i]);
        }
    }
}
