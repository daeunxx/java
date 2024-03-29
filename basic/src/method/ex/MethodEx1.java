package method.ex;

public class MethodEx1 {

    public static void main(String[] args) {
        printAverage(1, 2, 3);
        printAverage(15, 25, 35);
    }

    public static void printAverage(int a , int b, int c) {
        System.out.println("평균값 : " + (double) (a + b + c) / 3);
    }
}
