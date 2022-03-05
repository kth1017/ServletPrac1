//package hello.servlet.web.servletmvc;
//
//import hello.servlet.domain.member.Member;
//import hello.servlet.domain.member.MemberRepository;
//
//import javax.servlet.DispatcherType;
//import javax.servlet.RequestDispatcher;
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebServlet(name = "mvcSaveFormServlet", urlPatterns = "servlet-mvc/members/save")
//public class MvcSaveFormServlet extends HttpServlet {
//    MemberRepository memberRepository = MemberRepository.getInstance();
//
//    @Override
//    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String username = req.getParameter("username");
//        int age = Integer.parseInt(req.getParameter("age"));
//
//        Member member = new Member(username, age);
//        memberRepository.save(member);
//
//        // model에 객체 저장(지금은 req의 임시 저장소가 모델이 됨)
//        req.setAttribute("member", member);
//
//        // 뷰로 넘어감
//        String viewPath = "/WEB-INF/views/save-result.jsp";
//        RequestDispatcher dispatcher = req.getRequestDispatcher(viewPath);
//        dispatcher.forward(req, resp);
//
//    }
//}
