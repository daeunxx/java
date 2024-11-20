package annotation.basic;

@AnnotationMeta // 타입에 적용
public class MetaData {

  //@AnnotationMeta // 필드에 적용 - 컴파일 오류
  private String id;

  @AnnotationMeta
  public void call() {

  }

  public static void main(String[] args) throws NoSuchMethodException {
    AnnotationMeta typeAnnotation = MetaData.class.getAnnotation(AnnotationMeta.class);
    System.out.println("typeAnnotation = " + typeAnnotation);

    AnnotationMeta methodAnnotation = MetaData.class.getMethod("call")
        .getAnnotation(AnnotationMeta.class);
    System.out.println("methodAnnotation = " + methodAnnotation);
  }
}
