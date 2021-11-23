package com.example.week4_webapp.controller;

import com.example.week4_webapp.dao.InsertMobileDAO;
import com.example.week4_webapp.model.Mobile;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = {"/addNewMobile"})
public class AddNewMobile extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String brand = req.getParameter("brand");
        String model = req.getParameter("model");
        String priceStr = req.getParameter("price");
        double price = Double.parseDouble(priceStr);
        Mobile mobile = new Mobile();
        mobile.setBrand(brand);
        mobile.setModel(model);
        mobile.setPrice(price);
        InsertMobileDAO mobileDAO = new InsertMobileDAO();
        mobileDAO.addNewMobile(mobile);
        PrintWriter out = resp.getWriter();
        out.println("<script type=\"text/javascript\" charset=\"UTF-8\">");
        out.println("alert('Tạo mới mobile thành công')");
        out.println("</script>");
        resp.sendRedirect("addnewmobile.jsp");
    }
}
