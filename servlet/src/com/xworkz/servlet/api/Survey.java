package com.xworkz.servlet.api;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(urlPatterns = "/servlet",loadOnStartup = 1)
public class Survey extends HttpServlet {
    public Survey(){
        System.out.println("this is Survey");
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("this is doPost method");
    }
}
