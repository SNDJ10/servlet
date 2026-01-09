package com.xworkz.api;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.IOException;

public class Form extends GenericServlet {
    public Form(){
        System.out.println("this is form");
    }

    @Override
    public void init() throws ServletException {
        System.out.println("this is intialization");
    }

    @Override
    public void destroy() {

    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("this is service");
    }
}
