package annotation.basic;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import util.MyLogger;

@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationElement {

  String value();

  int count() default 0;

  String[] tags() default {};

  // MyLogger myLogger 선언 불가
  Class<? extends MyLogger> logger() default MyLogger.class; // 클래스 정보만 가능

}
