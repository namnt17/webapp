package com.example.week4_webapp.dao;

import com.example.week4_webapp.context.DBContext;
import com.example.week4_webapp.model.Cart;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class TotalPriceInCartDAO {
    Connection connection = null;
    PreparedStatement preparedStatement = null;
    ResultSet resultSet = null;

    public double getTotalCartPrice(ArrayList<Cart> cartList) {
        double sum = 0;
        String query = "Select price from Mobile where id = ?";
        try {
            if (cartList.size() > 0) {
                for (Cart items : cartList) {
                    connection = new DBContext().getConnection();
                    preparedStatement = connection.prepareStatement(query);
                    preparedStatement.setInt(1, items.getId());
                    resultSet = preparedStatement.executeQuery();
                    while (resultSet.next()) {
                        sum += resultSet.getDouble("price") * items.getQuantity();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return Math.round(sum * 100) / 100.0;
    }
}
