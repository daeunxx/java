package network.chat.server;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import network.chat.server.command.ChangeCommand;
import network.chat.server.command.Command;
import network.chat.server.command.DefaultCommand;
import network.chat.server.command.ExitCommand;
import network.chat.server.command.JoinCommand;
import network.chat.server.command.MessageCommand;
import network.chat.server.command.UsersCommand;

public class CommandManager {

  private static final String DELIMITER = "\\|";
  ;
  private final SessionManager sessionManager;
  private final Map<String, Command> commands = new HashMap<>();

  public CommandManager(SessionManager sessionManager) {
    this.sessionManager = sessionManager;
    init();
  }

  private void init() {
    commands.put("/join", new JoinCommand(sessionManager));
    commands.put("/change", new ChangeCommand(sessionManager));
    commands.put("/message", new MessageCommand(sessionManager));
    commands.put("/users", new UsersCommand(sessionManager));
    commands.put("/exit", new ExitCommand());
  }

  public void execute(String totalMessage, Session session) throws IOException {
    String commandKey = totalMessage.split(DELIMITER)[0];
    Command command = commands.getOrDefault(commandKey, new DefaultCommand());
    command.execute(totalMessage.split(DELIMITER), session);
  }
}
