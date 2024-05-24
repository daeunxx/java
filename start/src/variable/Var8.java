package variable;

public class Var8 {
    public static void main(String[] args) {
        // 정수
        byte b = 127;                        // -128 ~ 127
        short s = 32767;                     // -32,767 ~ 32,767
        int i = 2147483647;                  // -2,147,483,648 ~ 2,147,483,647
        long l = 9223372036854775807L;       // -9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807

        // 실수
        float f = 10.5f;
        double d = 10.5;                     // float보다 더 큰 범위의 실수 사용 가능

        String orderDetail = "hi";
    }
}
