//package com.myfirsttest.testing.Configuration;
//
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@Component
//public class CustomizeAuthenticationSuccessHandler implements AuthenticationSuccessHandler {
//
//    //Custom landing page after successful login
//    //sends to dashboard (which includes "logged in" features)
//    @Override
//    public void onAuthenticationSuccess(HttpServletRequest request,
//                                        HttpServletResponse response, Authentication authentication)
//            throws IOException, ServletException {
//        //set our response to OK status
//        response.setStatus(HttpServletResponse.SC_OK);
//
//        for (GrantedAuthority auth : authentication.getAuthorities()) {
//            if ("ADMIN".equals(auth.getAuthority())) {
//                response.sendRedirect("/dashboard");
//            }
//        }
//    }
//}
