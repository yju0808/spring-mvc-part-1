package hello.servlet.web.frontcontroller.v1.controller;

import java.io.IOException;

import hello.servlet.domain.Member;
import hello.servlet.domain.MemberRepository;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import hello.servlet.web.frontcontroller.v1.ControllerV1;



public class MemberSaveControllerV1 implements ControllerV1 {

    private MemberRepository memberRepository = MemberRepository.getInstance();

        
    @Override
    public void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


        String username = request.getParameter("username");
        int age = Integer.parseInt(request.getParameter("age"));

        Member member = new Member(username, age);
        memberRepository.save(member);


        // Model에 데이터를 보관한다.
        request.setAttribute("member", member);

        // 뷰를 선택한다.
        String viewPath = "/WEB-INF/views/save-result.jsp";

        // RequestDispatcher를 통해 JSP로 forward 한다.
        RequestDispatcher dispatcher = request.getRequestDispatcher(viewPath);

        dispatcher.forward(request, response);


    }
    
}
