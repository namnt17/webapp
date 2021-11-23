package com.example.week4_webapp.controller;

import com.example.week4_webapp.model.Cart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet(urlPatterns = {"/removeFromCart"})
public class RemoveFromCart extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        if(id != null){
            ArrayList<Cart> cart_list = (ArrayList<Cart>) req.getSession().getAttribute("cart_list");
            if(cart_list != null){
                for(Cart items: cart_list){
                    if(items.getId() == Integer.parseInt(id)){
                        cart_list.remove(cart_list.indexOf(items));
                        break;
                    }
                }
                resp.sendRedirect("showCart");
            }
        }else {
            resp.sendRedirect("showCart");
        }
    }
}
