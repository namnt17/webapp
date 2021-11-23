package com.example.week4_webapp.controller;

import com.example.week4_webapp.model.Cart;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(urlPatterns = {"/AddToCart"})
public class AddToCartController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        try(PrintWriter out=  resp.getWriter()) {
            ArrayList<Cart> cartList = new ArrayList<>();
            int pid = Integer.parseInt(req.getParameter("pid"));
            Cart cart = new Cart();
            cart.setId(pid);
            cart.setQuantity(1);
            HttpSession session = req.getSession();
            int id = (int) session.getAttribute("cid");
            ArrayList<Cart> cart_list = (ArrayList<Cart>) session.getAttribute("cart_list");
            if (cart_list == null) {
                cartList.add(cart);
                session.setAttribute("cart_list", cartList);
                resp.sendRedirect("getAllMobile?id="+id);
            } else {
                cartList = cart_list;
                boolean exits = false;
                for (Cart item : cart_list) {
                    if (item.getId() == pid) {
                        exits = true;
                        out.println("<h3>Product is exists<a href='showCart'>Go to cart</a></h3>");
                    }
                }
                if (!exits) {
                    cartList.add(cart);
                    resp.sendRedirect("getAllMobile?id="+id);
                }
            }
        }

    }

}
