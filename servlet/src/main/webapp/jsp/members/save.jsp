<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<%@ page import="hello.servlet.domain.Member" %>
<%@ page import="hello.servlet.domain.MemberRepository" %>

<%
    MemberRepository memberRepository = MemberRepository.getInstance();

    System.out.println("MemberService.service");
    String username = request.getParameter("username");
    int age = Integer.parseInt(request.getParameter("age"));

    Member member = new Member(username, age);
    memberRepository.save(member);



%>


<html>
<head>
    <title>Title</title>
</head>
<body>
성공
<ul>
    <li>이름: <%= member.getUsername() %></li>
    <li>나이: <%= member.getAge() %></li>
</ul>
<a href="/index.html">메인</a>
</body>
</html>
