package network.chat.server;

import static util.MyLogger.log;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SessionManager {

  private List<Session> sessions = new ArrayList<>();

  public synchronized void add(Session session) {
    sessions.add(session);
  }

  public synchronized void remove(Session session) {
    sessions.remove(session);
  }

  public synchronized List<String> getAllUsernames() {
    List<String> usernames = new ArrayList<>();
    sessions.stream()
        .map(Session::getUsername)
        .forEach(usernames::add);
    return usernames;
  }

  public synchronized void sendAll(String message) {
    for (Session session : sessions) {
      try {
        session.sendMessage(message);
      } catch (IOException e) {
        log(e);
      }
    }
  }

  public synchronized void closeAll() {
    sessions.forEach(Session::close);
  }
}
