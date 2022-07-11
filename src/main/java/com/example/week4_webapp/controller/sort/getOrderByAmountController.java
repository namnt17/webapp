package com.example.week4_webapp.controller.sort;

import com.example.week4_webapp.dao.sort.SortDAO;
import com.example.week4_webapp.model.OrderCustomer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/sort-by-amount"})
public class getOrderByAmountController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SortDAO amountDAO = new SortDAO();
        List<OrderCustomer> listSortByAmount = amountDAO.getBillByAmount();
        req.setAttribute("sortByAmount", listSortByAmount);
        req.getRequestDispatcher("sortByAmount.jsp").forward(req, resp);
    }
}
