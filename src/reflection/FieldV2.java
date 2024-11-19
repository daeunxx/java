package reflection;

import java.lang.reflect.Field;
import reflection.data.User;

public class FieldV2 {

  public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
    User user = new User("id1", "userA", 20);
    System.out.println("기존 이름: " + user.getName());

    Class<? extends User> userClass = user.getClass();
    Field nameField = userClass.getDeclaredField("name");

    nameField.setAccessible(true);
    nameField.set(user, "userB");
    System.out.println("변경된 이름: " + user.getName());
  }
}
