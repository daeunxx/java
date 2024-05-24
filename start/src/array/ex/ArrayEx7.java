package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("학생 수를 입력하세요 : ");
        int length = scanner.nextInt();

        int[][] scores = new int[length][3];
        int[] sums = new int[length];

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "번 학생의 성적을 입력하세요 : ");
            int sum = 0;

            for (int j = 0; j < scores[i].length; j++) {
                switch (j) {
                    case 0 -> System.out.print("국어 점수 : ");
                    case 1 -> System.out.print("영어 점수 : ");
                    case 2 -> System.out.print("수학 점수 : ");
                }
                scores[i][j] = scanner.nextInt();
                sum += scores[i][j];
            }
            sums[i] = sum;
        }

        for (int i = 0; i < sums.length; i++) {
            System.out.println(i + "번 학생의 총점 : " + sums[i] + ", 평균 : " + (double) sums[i] / 3);
        }
    }
}
