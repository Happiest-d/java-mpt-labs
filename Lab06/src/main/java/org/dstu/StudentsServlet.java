package org.dstu;

import org.dstu.db.DbWorker;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentsServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String[] name = req.getParameterValues("name");
        String[] surname = req.getParameterValues("surname");
        String[] middlename = req.getParameterValues("middlename");
        String[] exam = req.getParameterValues("exam");
        String[] result = req.getParameterValues("result");


        if (name[0].isEmpty() || surname[0].isEmpty()) {
            req.getRequestDispatcher("notfound.jsp").forward(req, resp);
        }



        if(DbWorker.getFromDbBySurname(surname[0])){
            req.getRequestDispatcher("exists.jsp").forward(req, resp);
        }


        System.out.println(name[0]);
        DbWorker.saveFromForm(name[0], surname[0], middlename[0], exam[0], result[0]);
        req.getRequestDispatcher("ok.jsp").forward(req, resp);
    }
}
