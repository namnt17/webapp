package com.example.week4_webapp.controller;

import com.example.week4_webapp.model.Cart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(urlPatterns = {"/quantity-inc-dec"})
public class ChangeQuantityController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String action = req.getParameter("action");
        int id = Integer.parseInt(req.getParameter("id"));

        ArrayList<Cart> cart_list = (ArrayList<Cart>) req.getSession().getAttribute("cart_list");
        if (action != null && id >= 1) {
            if (action.equals("inc")) {
                for (Cart item : cart_list) {
                    if (item.getId() == id) {
                        int quantity = item.getQuantity();
                        quantity++;
                        item.setQuantity(quantity);
                        resp.sendRedirect("showCart");
                    }
                }
            }
            if (action.equals("dec")) {
                for (Cart item : cart_list) {
                    if (item.getId() == id && item.getQuantity() > 1) {
                        int quantity = item.getQuantity();
                        quantity--;
                        item.setQuantity(quantity);
                        break;
                    }
                }
                resp.sendRedirect("showCart");
            }
        } else {
            resp.sendRedirect("showCart");
        }
    }
}
