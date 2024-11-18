package was.httpserver.servlet;

import java.io.IOException;
import was.httpserver.HttpRequest;
import was.httpserver.HttpResponse;
import was.httpserver.HttpServlet;
import was.httpserver.PageNotFoundException;

public class DefaultServlet implements HttpServlet {

  @Override
  public void service(HttpRequest request, HttpResponse response) throws IOException {
    throw new PageNotFoundException("request url: " + request.getPath());
  }
}
