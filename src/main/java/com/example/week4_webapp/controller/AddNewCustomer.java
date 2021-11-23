package com.example.week4_webapp.controller;

import com.example.week4_webapp.dao.InsertCustomerDAO;
import com.example.week4_webapp.model.Customer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = {"/addNewCustomer"})
public class AddNewCustomer extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("fullname");
        String address = req.getParameter("address");
        String group = req.getParameter("group");
        PrintWriter out = resp.getWriter();
        Customer customer = new Customer();
        customer.setName(name);
        customer.setAddress(address);
        customer.setGroup(group);
        InsertCustomerDAO insertNewCustomer = new InsertCustomerDAO();
        insertNewCustomer.addNewCustomer(customer);
        out.println("<script type=\"text/javascript\" charset=\"UTF-8\">");
        out.println("alert('Create new Customer success')");
        out.println("</script>");
        resp.sendRedirect("addnewcustomer.jsp");
    }
}
