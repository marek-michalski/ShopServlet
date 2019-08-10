package pl.marek.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LogServlet extends HttpServlet {
    private static final String NAME = "login";
    private static final String PASSWORD = "password";
    private static final String ATTRIBUTE_ADMIN = "access";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String login = req.getParameter(NAME);
        String password = req.getParameter(PASSWORD);
        HttpSession session = req.getSession();
        if (login.equals("admin") && password.equals("admin")) {
            session.setAttribute(ATTRIBUTE_ADMIN, "admin");
            resp.sendRedirect("/ShopServlet/productServlet");
        } else {
            resp.sendRedirect("/ShopServlet/login.jsp");
        }
    }

//    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//        PrintWriter pw = res.getWriter();
//        res.setContentType("text/html");
//        String user = req.getParameter("login");
//        String pass = req.getParameter("password");
//        pw.println("Login Success...!")
//        if (user.equals("admin") && pass.equals("admin"))
//            pw.println("Login Success...!");
//        else
//            pw.println("Login Failed...!");
//        pw.close();
//    }

}
