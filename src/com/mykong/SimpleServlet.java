package com.mykong;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

/**
 * Created by tethippe on 3/16/2016.
 */
@WebServlet(urlPatterns = {"/home"} , name="SimpleServlet")
public class SimpleServlet extends HttpServlet {
    String appName = "Default";

    @Override
    public void init() throws ServletException {
        appName = getInitParameter("ProductName");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.print("<h1>Hello World! The time is</h1>");
        out.println(LocalDateTime.now().toString());
        out.flush();

        String userName = request.getParameter("firstname");
        String password = request.getParameter("password");

        if (userName!=null && userName.matches("tejala")) {
            if (password!=null && password.matches("tejala")){
                out.println();
                out.printf("Welcome %s", userName);
                out.println();
                out.printf("Product name: %s", appName);
            } else {
//                out.printf("Bad Login");
                throw new ServletException("A name should be entered");
            }
        } else {
            out.printf("Bad Login");
        }
    }
}
