package class1;

public class ClassStartArray {
  public static void main(String[] args) {
    String[] studentNames = {"학생1", "학생2", "학생3"};
    int[] ages = {15, 16, 17};
    int[] grades = {90, 100, 70};

    for (int i = 0; i < studentNames.length; i++) {
      System.out.println("이름: " + studentNames[i] + " 나이: " + ages[i] + " 성적: " + grades[i]);
    }
  }
}
