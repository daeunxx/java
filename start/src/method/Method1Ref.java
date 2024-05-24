package method;

public class Method1Ref {
    public static void main(String[] args) {

        // 계산1
        int sum1 = add(5, 10);
        System.out.println("결과 1 출력 : " + sum1);

        System.out.println("=================");

        // 계산2
        int sum2 = add(15, 20);
        System.out.println("결과 2 출력 : " + sum2);

        // 계산3
        add(3, 5);
    }

    public static int add (int a, int b) {
        System.out.println(a + " + " + b + " 연산 수행을 합니다!");
        return a + b;
    }
}
