package hello.servlet.basic.request;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name="requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        System.out.println("username = " + username);
        request.getParameterNames().asIterator().forEachRemaining(paramName-> System.out.println(paramName+ " = "+request.getParameter(paramName)));
        response.getWriter().write("username : "+request.getParameter("username")+"\n");
        response.getWriter().write("age : " + request.getParameter("age"));
    }
}
