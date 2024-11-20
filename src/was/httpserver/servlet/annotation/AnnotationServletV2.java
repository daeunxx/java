package was.httpserver.servlet.annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import was.httpserver.HttpRequest;
import was.httpserver.HttpResponse;
import was.httpserver.HttpServlet;
import was.httpserver.PageNotFoundException;
import was.v8.SiteControllerV8;

public class AnnotationServletV2 implements HttpServlet {

  private final List<Object> controllers;

  public AnnotationServletV2(List<Object> controllers) {
    this.controllers = controllers;
  }

  @Override
  public void service(HttpRequest request, HttpResponse response) {
    String path = request.getPath();

    for (Object controller : controllers) {
      Method[] methods = controller.getClass().getDeclaredMethods();
      for (Method method : methods) {
        Mapping annotation = method.getAnnotation(Mapping.class);
        if (annotation != null && annotation.value().equals(path)) {
          invoke(new SiteControllerV8(), method, request, response);
          return;
        }
      }
    }
    throw new PageNotFoundException("request = " + path);
  }

  private static void invoke(Object controller, Method method, HttpRequest request, HttpResponse response) {
    Class<?>[] parameterTypes = method.getParameterTypes();
    Object[] args = new Object[parameterTypes.length];

    for (int i = 0; i < parameterTypes.length; i++) {
      if (parameterTypes[i] == HttpRequest.class) {
        args[i] = request;
      } else if (parameterTypes[i] == HttpResponse.class) {
        args[i] = response;
      } else {
        throw new IllegalArgumentException("Unsupported parameter type: " + parameterTypes);
      }
    }

    try {
      method.invoke(controller, args);
    } catch (IllegalAccessException | InvocationTargetException e) {
      throw new RuntimeException(e);
    }
  }
}
