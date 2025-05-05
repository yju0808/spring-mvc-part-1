package hello.servlet.web.frontcontroller.v5;

import java.io.IOException;
import jakarta.servlet.ServletException;

import hello.servlet.web.frontcontroller.ModelView;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public interface MyHandlerAdapter {

    public boolean supports(Object handler);

    public ModelView handle(HttpServletRequest request, HttpServletResponse response, Object handler) throws ServletException, IOException;
    
}
