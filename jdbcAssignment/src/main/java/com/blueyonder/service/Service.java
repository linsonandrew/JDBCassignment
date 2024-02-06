package com.blueyonder.service;

import com.blueyonder.exceptions.PasswordNotFound;
import com.blueyonder.exceptions.UserNotFound;
import com.blueyonder.model.User;

import java.sql.SQLException;

public interface Service {
    public User getPassword(String username,String password) throws SQLException, UserNotFound, PasswordNotFound;
    public User getUserbyname(String username) throws SQLException;

}
