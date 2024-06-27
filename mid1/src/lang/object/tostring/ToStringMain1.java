package lang.object.tostring;

public class ToStringMain1 {

  public static void main(String[] args) {
    Object object = new Object();
    String string = object.toString();

    //toString(): [클래스명@객체의 참조값] 출력
    //getClass().getName() + "@" + Integer.toHexString(hashCode())
    System.out.println(string);
    
    //object 직접 출력
    //println 메서드에 파라미터가 객체가 올 경우, Object.toString 메서드 호출
    System.out.println(object);
  }
}
