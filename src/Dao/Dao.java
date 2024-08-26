/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author MHD
 */
public interface Dao<T> {
    public boolean insert (T obj) throws SQLException;
    public boolean update (T obj) throws SQLException;
    public boolean delete (T obj) throws SQLException;
    public T select(T obj) throws SQLException;
    public ArrayList<T> getAll() throws SQLException;
    public ResultSet getRsAll() throws SQLException;
    public ResultSet search(String colName , String key ) throws SQLException;

}
