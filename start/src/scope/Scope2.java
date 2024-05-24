package scope;

public class Scope2 {
    public static void main(String[] args) {
        int m = 10;
        for (int i = 0; i < 2; i++) { // 블록 내부, for문 내
            System.out.println("for m = " + m); // 블록 외부에서 내부 접근 ㄱ나ㅡㅇ
            System.out.println("for i = " + i);
        } // i 생존 종료

        System.out.println("main m = " + m);
//        System.out.println("main i = " + i);
    }
}
