package com.example.layeredarchitecture.dao;

import com.example.layeredarchitecture.model.ItemDTO;

import java.sql.*;
import java.util.ArrayList;

public interface ItemDAO {
    ArrayList<ItemDTO> getAllItem() throws SQLException, ClassNotFoundException;

    boolean deleteItem(String code) throws SQLException, ClassNotFoundException;

    void updateItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;

    boolean saveItem(ItemDTO itemDTO) throws SQLException, ClassNotFoundException;

    ResultSet genarateCode() throws SQLException, ClassNotFoundException;

    boolean existItems(String code) throws SQLException, ClassNotFoundException;

    ItemDTO findItem(String newItemCode) throws SQLException, ClassNotFoundException;
}
