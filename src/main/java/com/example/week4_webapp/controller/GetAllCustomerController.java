package com.example.week4_webapp.controller;

import com.example.week4_webapp.dao.AddOrderForCustomerDAO;
import com.example.week4_webapp.model.Customer;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;


@WebServlet(urlPatterns = {"/listCustomer"})
public class GetAllCustomerController extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        HttpSession session = req.getSession();
        AddOrderForCustomerDAO listCustomer = new AddOrderForCustomerDAO();
        List<Customer> customerList =  listCustomer.getAllCustomer();
        req.setAttribute("listCustomer",customerList);
        session.removeAttribute("cart_list");
        req.getRequestDispatcher("addOrderForCustomer.jsp").forward(req,resp);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
