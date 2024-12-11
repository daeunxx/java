package network.chat.server.command;

import network.chat.server.Session;
import network.chat.server.SessionManager;

public class ChangeCommand implements Command {

  private final SessionManager sessionManager;

  public ChangeCommand(SessionManager sessionManager) {
    this.sessionManager = sessionManager;
  }

  @Override
  public void execute(String[] args, Session session) {
    String before = session.getUsername();
    String after = args[1];
    session.setUsername(after);
    sessionManager.sendAll(before + "님이 " + after + "으로 이름을 변경하였습니다.");
  }
}
