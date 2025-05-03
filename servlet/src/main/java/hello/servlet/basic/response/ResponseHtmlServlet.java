package hello.servlet.basic.response;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "responseHtmlServlet", urlPatterns = "/response-html")
public class ResponseHtmlServlet extends HttpServlet {



        @Override
        protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            response.setContentType("text/html");
            response.setCharacterEncoding("utf-8");

            response.getWriter().write("<html>");
            response.getWriter().write("<head>");
            response.getWriter().write("<title>안녕하세요</title>");
            response.getWriter().write("</head>");
            response.getWriter().write("<body>");
            response.getWriter().write("안녕하세요!");
            response.getWriter().write("</body>");
            response.getWriter().write("</html>");

    }
    
}
