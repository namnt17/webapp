package com.example.week4_webapp.dao;

import com.example.week4_webapp.context.DBContext;
import com.example.week4_webapp.model.Bill;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertBillDAO {
    Connection con;
    PreparedStatement statement;
    ResultSet resultSet;

    public void insertBill(Bill bill){
        String query = "insert into Bill values (?,?,?,?,?)";
        try {
            con = new DBContext().getConnection();
            statement = con.prepareStatement(query);
            statement.setString(1,bill.getCustomer().getName());
            statement.setString(2,bill.getCustomer().getAddress());
            statement.setString(3,bill.getCustomer().getGroup());
            statement.setInt(4,bill.getListCart().size());
            statement.setDouble(5,bill.getTotal());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
