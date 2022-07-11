package com.example.week4_webapp.controller.bill;

import com.example.week4_webapp.dao.bill.ShowBillDAO;
import com.example.week4_webapp.model.OrderCustomer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/show-all-bill"})
public class ShowAllBill extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ShowBillDAO listAllBill = new ShowBillDAO();
        List<OrderCustomer> listBill = listAllBill.getAllBill();
        req.setAttribute("listAllBill", listBill);
        req.getRequestDispatcher("showAllBill.jsp").forward(req, resp);

    }
}
