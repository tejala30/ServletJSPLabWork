package com.mykong;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Calendar;

/**
 * Created by tethippe on 3/17/2016.
 */
@WebServlet(name = "ControllerServlet")
public class ControllerServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    public void init() throws ServletException {
        ApplicationSettings applicationSettings = new ApplicationSettings();
        applicationSettings.setFormCssClass("blueUser");
        getServletContext().setAttribute("app", applicationSettings);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User();
        user.setName("Master");
        user.setEmail("master@gmail.com");

        String[] strDays = new String[] { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        Calendar now = Calendar.getInstance();
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/index.jsp");
//        getServletContext().setAttribute();
//        request.getSession().setAttribute();
        request.setAttribute("user", user);
        request.setAttribute("dayOfWeek", strDays[now.get(Calendar.DAY_OF_WEEK) - 1]);
        dispatcher.forward(request, response);

    }
}
