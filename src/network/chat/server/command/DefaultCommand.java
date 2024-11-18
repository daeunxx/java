package network.chat.server.command;

import java.io.IOException;
import network.chat.server.Session;

public class DefaultCommand implements Command {

  @Override
  public void execute(String[] args, Session session) throws IOException {
    session.sendMessage("재입력해주세요.");
  }
}
