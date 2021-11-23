package com.example.week4_webapp.controller;

import com.example.week4_webapp.dao.GetAllMobileDAO;
import com.example.week4_webapp.model.Customer;
import com.example.week4_webapp.model.Mobile;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(urlPatterns = {"/getAllMobile"})
public class GetAllMobileController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GetAllMobileDAO listMobile = new GetAllMobileDAO();
        List<Mobile> mobileList = listMobile.getAllMobile();
        int count = listMobile.count();
        int pageSize = 3;
        int endPage = 0;
        if(count % pageSize != 0){
            endPage ++;
        }
        req.setAttribute("listMobile",mobileList);
        req.setAttribute("endPage",endPage);
        HttpSession session = req.getSession();
        int cid = Integer.parseInt(req.getParameter("id"));
        session.setAttribute("cid",cid);
        req.getRequestDispatcher("GetAllMobile.jsp").forward(req,resp);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req,resp);
    }
}
