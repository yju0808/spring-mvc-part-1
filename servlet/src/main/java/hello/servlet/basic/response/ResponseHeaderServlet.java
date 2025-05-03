package hello.servlet.basic.response;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

import org.springframework.util.StreamUtils;

import hello.servlet.basic.HelloData;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletInputStream;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(name = "responseHeaderServlet", urlPatterns = "/response-header")
public class ResponseHeaderServlet  extends HttpServlet {

    
        protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            response.setStatus(HttpServletResponse.SC_OK); // 200


            content(response);
            cookie(response);
            
            response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");
            response.setHeader("Pragma", "no-cache");

            response.setHeader("my-header", "hello");
            response.getWriter().write("ok");



    }

    private void content(HttpServletResponse response) {
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
    }

    private void cookie(HttpServletResponse response) {
        Cookie cookie = new Cookie("my-cookie", "good");
        cookie.setMaxAge(600);
        response.addCookie(cookie);
    }

    private void redirect(HttpServletResponse response) throws IOException {
        //response.setStatus(HttpServletResponse.SC_FOUND); // 302
        //response.setHeader("Location", "/basic/hello-form.html");

        response.sendRedirect("/basic/hello-form.html");
    }
    
}
