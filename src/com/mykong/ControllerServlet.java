package com.mykong;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by tethippe on 3/17/2016.
 */
@WebServlet(name = "ControllerServlet")
public class ControllerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        user.setName("Tejala");
        user.setEmail("tejala@gmail.com");

        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/index.jsp");
//        getServletContext().setAttribute();
//        request.getSession().setAttribute();
        request.setAttribute("user", "Hello World");
        dispatcher.forward(request, response);

    }
}
