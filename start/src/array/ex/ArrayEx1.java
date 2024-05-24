package array.ex;

import java.util.Arrays;

public class ArrayEx1 {

    public static void main(String[] args) {
        int[] students = new int[5];
        int total = 0;

        for (int i = 0; i < students.length; i++) {
            students[i] = 100 - (i + 1) * 10;
            total += students[i];
        }

        double average = (double) total / students.length;

        System.out.println("점수 총합 : " + total);
        System.out.println("점수 평균 : " + average);
    }
}
