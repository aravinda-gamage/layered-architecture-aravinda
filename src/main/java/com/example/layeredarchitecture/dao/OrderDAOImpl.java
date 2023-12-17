package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.db.DBConnection;
import java.sql.*;
import java.time.LocalDate;

public class OrderDAOImpl implements OrderDAO{
    public ResultSet generateNewOrderId() throws SQLException, ClassNotFoundException {
        Connection connection = DBConnection.getDbConnection().getConnection();
        Statement stm = connection.createStatement();
        return stm.executeQuery("SELECT oid FROM `Orders` ORDER BY oid DESC LIMIT 1;");
    }
}
