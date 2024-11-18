package was.v5.servlet;

import java.io.IOException;
import was.httpserver.HttpRequest;
import was.httpserver.HttpResponse;
import was.httpserver.HttpServlet;

public class SearchServlet implements HttpServlet {

  @Override
  public void service(HttpRequest request, HttpResponse response) throws IOException {
    String query = request.getParameter("q");

    response.writeBody("<h1>search</h1>");
    response.writeBody("<li>query: " + query + "</li>");
  }
}
