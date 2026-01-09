package com.xworkz.api.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/pizza",loadOnStartup = 2)
public class PizzaSrvlet extends GenericServlet {
    public PizzaSrvlet(){
        System.out.println("this is running successfully");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("the ipizza is initialized..");
    }

    @Override
    public void destroy() {
        System.out.println("pizza destroyd..");
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("this is pizza");
    }
}
