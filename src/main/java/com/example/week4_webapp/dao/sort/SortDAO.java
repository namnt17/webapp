package com.example.week4_webapp.dao.sort;

import com.example.week4_webapp.context.DBContext;
import com.example.week4_webapp.model.Bill;
import com.example.week4_webapp.model.Cart;
import com.example.week4_webapp.model.Customer;
import com.example.week4_webapp.model.OrderCustomer;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SortDAO {
    Connection con;
    PreparedStatement statement;
    ResultSet resultSet;

    public List<OrderCustomer> getBillByAmount() {
        List<OrderCustomer> billList = new ArrayList<>();
        String query = "select * from Bill order by quantity_buy desc";
        try {
            con = new DBContext().getConnection();
            statement = con.prepareStatement(query);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                billList.add(new OrderCustomer(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getInt(5),
                        resultSet.getDouble(6)
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return billList;
    }

    public List<OrderCustomer> getBillByName() {
        List<OrderCustomer> billList = new ArrayList<>();
        String query = "select * from Bill order by name_kh desc";
        try {
            con = new DBContext().getConnection();
            statement = con.prepareStatement(query);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                billList.add(new OrderCustomer(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getInt(5),
                        resultSet.getDouble(6)
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return billList;
    }
}
