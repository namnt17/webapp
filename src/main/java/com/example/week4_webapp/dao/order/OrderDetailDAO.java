package com.example.week4_webapp.dao.order;

import com.example.week4_webapp.context.DBContext;
import com.example.week4_webapp.model.OrdersDetail;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class OrderDetailDAO {
    Connection con;
    PreparedStatement statement;
    ResultSet resultSet;

    public boolean insertOrder(OrdersDetail model) {
        boolean result = false;
        String query = "insert into Orders(p_id,u_id,o_quantity,b_id) values(?,?,?,?)";

        try {
            con = new DBContext().getConnection();
            statement = con.prepareStatement(query);
            statement.setInt(1, model.getId());
            statement.setInt(2, model.getUid());
            statement.setInt(3, model.getQuantity());
            statement.setInt(4, model.getBid());
            statement.executeUpdate();
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
