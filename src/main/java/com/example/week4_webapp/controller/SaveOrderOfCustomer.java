package com.example.week4_webapp.controller;

import com.example.week4_webapp.dao.InsertBillDAO;
import com.example.week4_webapp.dao.order.OrderDetailDAO;
import com.example.week4_webapp.model.Bill;
import com.example.week4_webapp.model.Cart;
import com.example.week4_webapp.model.Customer;
import com.example.week4_webapp.model.OrdersDetail;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet(urlPatterns = {"/save-order"})
public class SaveOrderOfCustomer extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        try (PrintWriter out = resp.getWriter();) {

            HttpSession session = req.getSession();
            // get information customer shopping
            Customer customer = (Customer) session.getAttribute("customer");
            // get cart of customer shopping
            ArrayList<Cart> cartList = (ArrayList<Cart>) session.getAttribute("cart_list");
            // get total price in cart of customer
            double totalPrice = (double) session.getAttribute("totalPrice");
            Bill bill = new Bill();
            bill.setCustomer(customer);
            bill.setListCart(cartList);
            bill.setTotal(totalPrice);
            bill.setB_id(bill.getB_id());
            // save bill
            InsertBillDAO insertBillDAO = new InsertBillDAO();
            insertBillDAO.insertBill(bill);

            if (cartList != null && customer != null) {
                for (Cart c : cartList) {
                    // create OrderDetail Object
                    OrdersDetail ordersDetail = new OrdersDetail();
                    ordersDetail.setId(c.getId());
                    ordersDetail.setUid(customer.getId());
                    ordersDetail.setQuantity(c.getQuantity());
                    ordersDetail.setBid(bill.getB_id());
                    // save orderDetail in each bill
                    OrderDetailDAO orderDetailDAO = new OrderDetailDAO();
                    boolean result = orderDetailDAO.insertOrder(ordersDetail);
                    if (!result) {
                        out.println("order failed");
                    }
                }
            }
            resp.sendRedirect("listCustomer");

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
