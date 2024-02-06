package com.blueyonder.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static final String url="jdbc:postgresql://localhost:5432/usserasgn";
    public static Connection getDBConnection(){
        Connection conn = null;
        try{
            conn = DriverManager.getConnection(url,"postgres","postgres");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
}
