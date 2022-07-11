package com.example.week4_webapp.controller;

import com.example.week4_webapp.dao.GetCustomerByIdDAO;
import com.example.week4_webapp.dao.ShowMobileInCartDAO;
import com.example.week4_webapp.dao.TotalPriceInCartDAO;
import com.example.week4_webapp.model.Cart;
import com.example.week4_webapp.model.Customer;
import com.example.week4_webapp.model.Mobile;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(urlPatterns = {"/showCart"})
public class ShowCartController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try (PrintWriter out = resp.getWriter()) {
            HttpSession session = req.getSession();
            ArrayList<Cart> cartList = (ArrayList<Cart>) session.getAttribute("cart_list");
            List<Cart> cartProduct = null;
            int cid = (int) session.getAttribute("cid");
            GetCustomerByIdDAO customer = new GetCustomerByIdDAO();
            // save customer are shopping
            Customer customer1 = customer.getCustomerById(cid);
            session.setAttribute("customer", customer1);
            ShowMobileInCartDAO mInCart = new ShowMobileInCartDAO();
            try {
                if (cartList.isEmpty()) {
                    System.out.println("Cart is empty");
                }
            } catch (NullPointerException e) {
                System.out.println(e.getMessage());
            }
            cartProduct = mInCart.getCartProducts(cartList);
            // totalPrice
            TotalPriceInCartDAO total = new TotalPriceInCartDAO();
            double totalPrice = total.getTotalCartPrice(cartList);
            session.setAttribute("totalPrice", totalPrice);
            req.setAttribute("cart_list", cartProduct);
            req.setAttribute("total", totalPrice);
            req.getRequestDispatcher("cart.jsp").forward(req, resp);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
