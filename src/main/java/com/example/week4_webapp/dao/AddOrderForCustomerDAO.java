package com.example.week4_webapp.dao;

import com.example.week4_webapp.context.DBContext;
import com.example.week4_webapp.model.Customer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class AddOrderForCustomerDAO {

    Connection con;
    PreparedStatement statement;
    ResultSet resultSet;

    public List<Customer> getAllCustomer(){
        List<Customer> customerList = new ArrayList<>();
        String query = "select * from Customer";
        try {
            con = new DBContext().getConnection();
            statement = con.prepareStatement(query);
            resultSet = statement.executeQuery();
            while (resultSet.next()){
                customerList.add(
                        new Customer(
                            resultSet.getInt(1),
                            resultSet.getString(2),
                            resultSet.getString(3),
                            resultSet.getString(4)
                        )
                );

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return customerList;
    }



}
