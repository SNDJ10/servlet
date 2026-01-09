package com.xworkz.servlet;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;
@WebServlet(urlPatterns = "/matrimony",loadOnStartup=1)
public class Matrimony extends GenericServlet {
    public Matrimony(){
        System.out.println("this is intialization");
    }
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
       String name=servletRequest.getParameter("brideName") ;
    }
}
