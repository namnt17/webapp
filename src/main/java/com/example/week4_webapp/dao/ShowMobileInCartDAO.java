package com.example.week4_webapp.dao;

import com.example.week4_webapp.context.DBContext;
import com.example.week4_webapp.model.Cart;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ShowMobileInCartDAO {
    Connection con;
    PreparedStatement statement;
    ResultSet resultSet;

    public List<Cart> getCartProducts(ArrayList<Cart> cartList) {
        List<Cart> products = new ArrayList<>();
        try {
            if (cartList.size() > 0) {
                for (Cart items : cartList) {
                    con = new DBContext().getConnection();
                    String query = "select * from Mobile where id = ?";
                    statement = con.prepareStatement(query);
                    statement.setInt(1, items.getId());
                    resultSet = statement.executeQuery();
                    while (resultSet.next()) {
                        Cart cart = new Cart();
                        cart.setId(resultSet.getInt("id"));
                        cart.setBrand(resultSet.getString("brand"));
                        cart.setModel(resultSet.getString("model"));
                        cart.setPrice(resultSet.getDouble("price") * items.getQuantity());
                        cart.setQuantity(items.getQuantity());
                        products.add(cart);
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return products;
    }
}
