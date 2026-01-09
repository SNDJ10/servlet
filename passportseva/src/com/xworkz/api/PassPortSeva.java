package com.xworkz.api;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/passport",loadOnStartup = 1)
public class PassPortSeva extends GenericServlet {
    public PassPortSeva(){
        System.out.println("this is passport");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("this is init");
    }

    @Override
    public void destroy() {
        System.out.println("passport destroyed");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service has called");
    }


}
