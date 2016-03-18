package com.mykong;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by tethippe on 3/18/2016.
 */
@WebServlet(name = "EntityServlet")
public class EntityServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ArrayList<Entity> entities = new ArrayList<Entity>();
        Integer numOfRecords = 10;

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        while (numOfRecords > 0 ) {
            Entity en = new Entity();
            en.setName("Entity" + (numOfRecords).toString());
            en.setName((dateFormat.format(date)));
            en.setDescription("Entity" + (numOfRecords).toString());
            en.setPrice((float) (1.0 * numOfRecords));
            en.setQuantity(numOfRecords);
            entities.add(en);
        }

        for (Entity en : entities
                ) {
            System.out.println(en.toString());
            System.out.println();
        }

//        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/WEB-INF/entity_index.jsp");
        getServletContext().setAttribute("entities", entities);
//        request.getSession().setAttribute();
//        request.setAttribute("user", user);
//        request.setAttribute("dayOfWeek", strDays[now.get(Calendar.DAY_OF_WEEK) - 1]);
//        dispatcher.forward(request, response);
    }
}
