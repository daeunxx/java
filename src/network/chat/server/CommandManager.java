package network.chat.server;

import java.io.IOException;

public class CommandManager {

  private static final String DELIMITER = "\\|";;
  private final SessionManager sessionManager;

  public CommandManager(SessionManager sessionManager) {
    this.sessionManager = sessionManager;
  }

  public void execute(String message, Session session) throws IOException {
    if (message.startsWith("/join")) {
      String username = message.split(DELIMITER)[1];
      session.setUsername(username);
      sessionManager.sendAll(username + "님이 입장했습니다.");
    } else if (message.startsWith("/change")) {
      String beforeUsername = session.getUsername();
      String newUsername = message.split(DELIMITER)[1];
      session.setUsername(newUsername);
      sessionManager.sendAll(beforeUsername + "님이 " + newUsername + "으로 이름을 변경하였습니다.");
    } else if (message.startsWith("/message")) {
      String sendTo = message.split(DELIMITER)[1];
      sessionManager.sendAll("[" + session.getUsername() + "] " + sendTo);
    } else if (message.equals("/users")) {
      StringBuilder sb = new StringBuilder("전체 사용자: ");
      sessionManager.getAllUsernames().forEach(username -> {sb.append(username).append(", ");});
      sb.deleteCharAt(sb.length() - 2);
      session.sendMessage(sb.toString());
    } else if (message.startsWith("/exit")) {
      throw new IOException("exit");
    }
  }
}
