package hello.servlet.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.Member;

import hello.servlet.domain.MemberRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "memberFormServlet", urlPatterns = "/servlet/members/new-form")
public class MemberFormServlet extends HttpServlet {

    private MemberRepository memberRepository = MemberRepository.getInstance();


    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        response.setContentType("text/html");
        response.setCharacterEncoding("utf-8");


        PrintWriter writer = response.getWriter();
        writer.write("<!DOCTYPE html>" + 
                "<html>" +
                "<head>" +
                "<meta charset=\"utf-8\">" +
                "<title>Title</title>" +
                "</head>" +
                "<body>" +
                "<form action=\"/servlet/members/save\" method=\"post\">" +
                "username: <input type=\"text\" name=\"username\" />" +
                "age: <input type=\"text\" name=\"age\" />" +
                "<button type=\"submit\">전송</button>" +
                "</form>" +
                "</body>" +
                "</html>");

    }
    
}
