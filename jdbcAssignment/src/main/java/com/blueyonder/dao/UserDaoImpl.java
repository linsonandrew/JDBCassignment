package com.blueyonder.dao;

import com.blueyonder.exceptions.PasswordNotFound;
import com.blueyonder.exceptions.UserNotFound;
import com.blueyonder.model.User;
import com.blueyonder.util.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import static com.blueyonder.util.DatabaseConnection.getDBConnection;
import static com.blueyonder.util.QueryMapper.*;

public class UserDaoImpl implements UserDao {
    public Connection conn = getDBConnection();
    @Override
    public User getPassword(String username, String password) throws SQLException,UserNotFound, PasswordNotFound {
        PreparedStatement stmt = conn.prepareStatement(CHECKING_STRING);
        stmt.setString(1,username);
        ResultSet rs =stmt.executeQuery();
        if(rs.next()){
            if(password.equals(rs.getString(1))){
                return getUserbyname(username);
            }
            else{
                throw new PasswordNotFound();
            }
        }
        else{
            throw new UserNotFound();
        }
    }
    @Override
    public User getUserbyname(String username) throws SQLException{
        PreparedStatement stmt = conn.prepareStatement(OUTPUT_STRING);
        stmt.setString(1,username);
        ResultSet rs =stmt.executeQuery();
        User uu = new User();
        while(rs.next()){
            uu.setUserId(rs.getInt(1));
            uu.setUsername(rs.getString(2));
            uu.setPassword(rs.getString(3));
        }
        return uu;
    }
}
