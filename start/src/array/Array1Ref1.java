package array;

import java.util.Arrays;

public class Array1Ref1 {

    public static void main(String[] args) {
        int[] students = new int[5]; // 배열 변수 선언 및 배열 생성

        // 변수 값 대입
        students[0] = 90;
        students[1] = 80;
        students[2] = 70;
        students[3] = 60;
        students[4] = 50;

        System.out.println(students);
        System.out.println(Arrays.toString(students));
    }
}
