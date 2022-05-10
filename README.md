# ServletPrac1
 spring, servlet, JSP / 서블릿으로 mvc 구축 예제 / 2205
 블로그 포스팅 : https://fadet-coding.tistory.com/38
 
# 개요
- 스프링에서 서블릿으로 직접 mvc 패턴 구현

- 디스패쳐서블릿의 역할 이해 및 서블릿의 작동 원리 학습

- ModelAndView, ViewResolver, HandlerMapper 등 추상화된 Component 학습

# 요약

- v1 : 프론트컨트롤러의 도입, dispatcher forward()를 직접하는 controller 사용
- v2 : 컨트롤러의 forward()를 하는 로직을 따로 정리한 MyView 클래스 도입
- v3 : request의 model 역할을 분리하여 ModelView 클래스 도입, viewResolver() 도입
- v4 : (프로젝트) 사용이 편리하도록 Controller 로직 변경
       (블로그 포스트) 핸들러 어댑터 도입
