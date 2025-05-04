package hello.servlet.web.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import hello.servlet.domain.Member;
import hello.servlet.domain.MemberRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet(name = "memberSaveServlet", urlPatterns = "/servlet/members/save")
public class MemberSaveServlet extends HttpServlet {

    private MemberRepository memberRepository = MemberRepository.getInstance();


    
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        System.out.println("MemberSaveServlet.service");
        String username = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("age"));

        Member member = new Member(username, age);
        memberRepository.save(member);

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
                "성공" +
                "<ul>" +
                "<li>id=" + member.getId() + "</li>" +
                "<li>username=" + member.getUsername() + "</li>" +
                "<li>age=" + member.getAge() + "</li>" +
                "</ul>" +
                "<a href=\"/index.html\">메인</a>" +
                "</body>" +
                "</html>");
    }
}
