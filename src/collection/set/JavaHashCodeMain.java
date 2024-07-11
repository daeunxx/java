package collection.set;

import collection.set.member.Member;

public class JavaHashCodeMain {

  public static void main(String[] args) {
    //Object의 기본 hasnCode는 객체의 참조값을 기반으로 생성
    Object obj1 = new Object();
    Object obj2 = new Object();
    System.out.println("obj1 = " + obj1);
    System.out.println("Integer.toHexString(obj1.hashCode()) = " + Integer.toHexString(obj1.hashCode()));
    System.out.println("obj1.hashCode() = " + obj1.hashCode()); //참조값을 16진수로 변환
    System.out.println("obj2.hashCode() = " + obj2.hashCode());

    //각 클래스마다 hashCode를 이미 오버라이딩
    Integer i = 10;
    String str1 = "A";
    String str2 = "AB";

    System.out.println("10.hashCode() = " + i.hashCode());
    System.out.println("'A'.hashCode() = " + str1.hashCode());
    System.out.println("'AB'.hashCode() = " + str2.hashCode());

    //hashCode는 마이너스 값 들어올 수 있음
    System.out.println("-1.hashCode() = " + Integer.valueOf(-1).hashCode());

    //인스턴스는 다르지만 equals는 같으면 hashCode도 같다고 오버라이딩(IDE 제공)함
    Member member1 = new Member("idA");
    Member member2 = new Member("idA");

    System.out.println("(member1 == member2) = " + (member1 == member2));
    System.out.println("(member1.equals(member2)) = " + (member1.equals(member2)));
    System.out.println("member1.hashCode() = " + member1.hashCode());
    System.out.println("member2.hashCode() = " + member2.hashCode());
  }
}
