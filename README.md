# 🌐 스프링 MVC 1편 - 백엔드 웹 개발 핵심 기술 정리

김영한님의 인프런 강의를 따라가며 실습한 코드와 내용을 정리한 레포입니다.  
서블릿부터 스프링 MVC까지, 웹 애플리케이션 동작 원리와 스프링 프레임워크의 구조를 단계별로 학습했습니다.

---

## 📘 학습한 주요 개념

### 1️⃣ 웹 애플리케이션의 기본 구조 이해
- 웹 서버 vs WAS 차이
- HTTP 요청/응답 흐름
- CSR, SSR의 개념과 차이
- 자바 백엔드 기술 스택의 발전

### 2️⃣ 서블릿 기반 웹 프로그래밍
- HttpServletRequest / HttpServletResponse 사용법
- GET/POST 요청 파라미터 처리
- 요청 본문(JSON, 텍스트) 처리
- 응답 데이터 작성 (HTML, JSON)

### 3️⃣ JSP와 MVC 패턴
- JSP를 통한 View 생성
- 서블릿 + JSP 조합으로 MVC 구성
- MVC 패턴의 한계와 개선 필요성

### 4️⃣ 나만의 MVC 프레임워크 구현
- 프론트 컨트롤러 패턴 적용
- 버전별 컨트롤러 구조 개선 (v1 ~ v5)
- 뷰 분리, 모델 도입, 어댑터 설계 등 실전 구조 설계 경험

### 5️⃣ 스프링 MVC 구조의 이해
- DispatcherServlet 동작 원리
- 핸들러 매핑과 어댑터 메커니즘
- 뷰 리졸버와 템플릿 처리 흐름

### 6️⃣ 스프링 MVC의 기본 기능
- @RequestMapping 기반 요청 처리
- @RequestParam, @ModelAttribute 활용
- 요청 메시지 변환 (@RequestBody), 응답 메시지 작성
- 정적 리소스, 템플릿, HTTP 메시지 컨버터 이해

### 7️⃣ 타임리프를 활용한 웹 페이지 개발
- 상품 등록, 조회, 수정 페이지 개발
- 타임리프와 폼 데이터 바인딩
- PRG(Post-Redirect-Get) 패턴 적용
- RedirectAttributes를 활용한 리디렉션 처리

---

## 🔗 참고
- 강의 링크: [스프링 MVC 1편 - 백엔드 웹 개발 핵심 기술](https://www.inflearn.com/course/%EC%8A%A4%ED%94%84%EB%A7%81-mvc-1)  
- 강사: 김영한