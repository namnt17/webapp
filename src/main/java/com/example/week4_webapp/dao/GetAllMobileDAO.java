package com.example.week4_webapp.dao;

import com.example.week4_webapp.context.DBContext;
import com.example.week4_webapp.model.Mobile;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class GetAllMobileDAO {

    Connection con;
    PreparedStatement statement;
    ResultSet resultSet;

    public List<Mobile> getAllMobile(){
        List<Mobile> list = new ArrayList<>();
        String query = "SELECT * FROM Mobile";
        try {
            con = new DBContext().getConnection();
            statement = con.prepareStatement(query);
            resultSet = statement.executeQuery();
            while (resultSet.next()){
                list.add(new Mobile(
                        resultSet.getInt(1),
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getDouble(4)
                ));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public int count(){
        String query = "select count(*) from Mobile";
        try {
            con = new DBContext().getConnection();
            statement = con.prepareStatement(query);
            resultSet = statement.executeQuery();
            while (resultSet.next()){
                resultSet.getInt(1);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }


}
