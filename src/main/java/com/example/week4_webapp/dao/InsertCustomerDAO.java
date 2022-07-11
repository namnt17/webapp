package com.example.week4_webapp.dao;

import com.example.week4_webapp.context.DBContext;
import com.example.week4_webapp.model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertCustomerDAO {

    Connection con;
    PreparedStatement statement;


    public void addNewCustomer(Customer customer) {
        String query = "insert into Customer values(?,?,?)";
        try {
            con = new DBContext().getConnection();
            statement = con.prepareStatement(query);
            statement.setString(1, customer.getName());
            statement.setString(2, customer.getAddress());
            statement.setString(3, customer.getGroup());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
