package network.chat.server.command;

import java.io.IOException;
import network.chat.server.Session;
import network.chat.server.SessionManager;

public class UsersCommand implements Command {

  private final SessionManager sessionManager;

  public UsersCommand(SessionManager sessionManager) {
    this.sessionManager = sessionManager;
  }

  @Override
  public void execute(String[] args, Session session) throws IOException {
    StringBuilder sb = new StringBuilder("전체 사용자: ");
    sessionManager.getAllUsernames().forEach(username -> {
      sb.append(username).append(", ");
    });
    sb.deleteCharAt(sb.length() - 2);
    session.sendMessage(sb.toString());
  }
}
