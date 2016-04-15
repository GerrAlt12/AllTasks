package com.myfirstservlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServletDemo extends HttpServlet {

//tst234
    private int initCount = 0;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) {
        try {
            String s = "Hello, World! " + initCount;
            response.getWriter().write(s, 0, s.length());
        } catch (Exception e) {

        }
        initCount++;
    }
}
