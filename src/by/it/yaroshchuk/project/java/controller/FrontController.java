package by.it.yaroshchuk.project.java.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class FrontController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        process(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        process(req, resp);
    }

    private void process (HttpServletRequest rq, HttpServletResponse res) throws IOException, ServletException {

        String command = rq.getParameter("command");
        String view = "/error.jsp";
        switch (command) {
            case "Login": view = Actions.LOGIN.jsp;
            break;
            case "Logout": view = Actions.LOGOUT.jsp;
                break;
            case "Index": view = Actions.INDEX.jsp;
                break;
            case "SignUp": view = Actions.SIGNUP.jsp;
                break;

        }

        getServletContext().getRequestDispatcher(view).forward(rq,res);
    }
}