package network.chat.server.command;

import java.io.IOException;
import network.chat.server.Session;

public interface Command {

  void execute(String[] args, Session session) throws IOException;
}
