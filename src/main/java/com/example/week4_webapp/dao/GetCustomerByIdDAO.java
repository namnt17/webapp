package com.example.week4_webapp.dao;

import com.example.week4_webapp.context.DBContext;
import com.example.week4_webapp.model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class GetCustomerByIdDAO {
    Connection con;
    PreparedStatement statement;
    ResultSet resultSet;

    public Customer getCustomerById(int id){
        String query = "SELECT * FROM Customer where id = ?";
        try {
            con = new DBContext().getConnection();
            statement = con.prepareStatement(query);
            statement.setInt(1,id);
            resultSet = statement.executeQuery();
            while (resultSet.next()){
                return new Customer(
                    resultSet.getInt(1),
                    resultSet.getString(2),
                    resultSet.getString(3),
                    resultSet.getString(4)
                );
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
