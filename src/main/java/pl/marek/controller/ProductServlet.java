package pl.marek.controller;

import pl.marek.model.Product;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/productServlet")
public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        if (id == null) {
            //wyświetl całą listę
        } else {
            //wyświetl produkt po id
        }
    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String desc = req.getParameter("desc");
        String price = req.getParameter("price");
        String amount = req.getParameter("amount");
        String photo = req.getParameter("photo");
        Product product = new Product(
                Integer.valueOf(id),
                name,
                desc,
                Integer.valueOf(price),
                Integer.valueOf(amount),
                photo);
    }
}