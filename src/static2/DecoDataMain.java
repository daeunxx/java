package static2;

import static static2.DecoData.*;

public class DecoDataMain {

  public static void main(String[] args) {
    System.out.println("1. 정적 호출");
    staticCall();
    staticCall();
    staticCall();

    System.out.println("2. 인스턴스 호출1");
    DecoData decoData1 = new DecoData();
    decoData1.instanceCall();

    System.out.println("3. 인스턴스 호출2");
    DecoData decoData2 = new DecoData();
    decoData2.instanceCall();

    System.out.println("4. 매개변수 활용하여 정적 호출");
    staticCall(decoData1);

    System.out.println("5. 객체를 통한 정적 호출");
    DecoData decoData3 = new DecoData();
    decoData3.staticCall();
  }
}
