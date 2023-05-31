package com.liu.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class BaseServlet extends HttpServlet {


    protected <T> void doPost(HttpServletRequest req, HttpServletResponse resp, List<T> params) throws ServletException, IOException {
        // TODO 自动生成的方法存根


        req.setAttribute("key", params);
        req.getRequestDispatcher("/xueshenxx.jsp").forward(req, resp);
    }

}
