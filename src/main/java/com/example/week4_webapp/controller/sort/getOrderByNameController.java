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

@WebServlet(urlPatterns = {"/sort-by-name"})
public class getOrderByNameController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SortDAO sortDAO = new SortDAO();
        List<OrderCustomer> sortByName = sortDAO.getBillByName();
        req.setAttribute("sortByName", sortByName);
        req.getRequestDispatcher("sortByName.jsp").forward(req, resp);

    }
}
