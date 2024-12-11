package webservice;

import io.member.MemberRepository;
import io.member.impl.FileMemberRepository;
import java.io.IOException;
import java.util.List;
import was.httpserver.HttpServer;
import was.httpserver.HttpServlet;
import was.httpserver.ServletManager;
import was.httpserver.servlet.annotation.AnnotationServletV3;

public class MemberServiceMain {

  private static final int PORT = 12345;

  public static void main(String[] args) throws IOException {
    MemberRepository memberRepository = new FileMemberRepository();
    MemberController memberController = new MemberController(memberRepository);

    HttpServlet httpServlet = new AnnotationServletV3(List.of(memberController));
    ServletManager servletManager = new ServletManager();
    servletManager.setDefaultServlet(httpServlet);

    HttpServer httpServer = new HttpServer(PORT, servletManager);
    httpServer.start();
  }
}
