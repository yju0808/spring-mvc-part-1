package hello.servlet.web.springmvc.old;

import java.io.IOException;

import org.springframework.stereotype.Component;
import org.springframework.web.HttpRequestHandler;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@Component("/springmvc/request-handler")
public class MyHttpRequestHandler implements HttpRequestHandler {

    @Override
    public void handleRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("MyHttpRequestHandler.handleRequest");
        response.getWriter().write("OK");
    }
    
}
