package com.liu.servlet;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;



public class sereltdamoe extends HttpServlet {

@Override
    protected  void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
    String name="aaaaa";
    response.getWriter().println(name);
    System.out.println("success");
    doGet(request, response);
}
}
