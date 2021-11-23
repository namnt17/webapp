package com.example.week4_webapp.dao;

import com.example.week4_webapp.context.DBContext;
import com.example.week4_webapp.model.Mobile;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class InsertMobileDAO {

    Connection con;
    PreparedStatement statement;

    public void addNewMobile(Mobile mobile){
        String query = "insert into Mobile values(?,?,?)";
        try {
            con = new DBContext().getConnection();
            statement = con.prepareStatement(query);
            statement.setString(1,mobile.getBrand());
            statement.setString(2,mobile.getModel());
            statement.setDouble(3,mobile.getPrice());
            statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
