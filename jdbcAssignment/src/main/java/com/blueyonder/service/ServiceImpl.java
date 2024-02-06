package com.blueyonder.service;

import com.blueyonder.dao.UserDao;
import com.blueyonder.dao.UserDaoImpl;
import com.blueyonder.exceptions.PasswordNotFound;
import com.blueyonder.exceptions.UserNotFound;
import com.blueyonder.model.User;

import java.sql.SQLException;

public class ServiceImpl implements Service {
    public UserDao userdao = new UserDaoImpl();
    @Override
    public User getPassword(String username, String password) throws SQLException, UserNotFound, PasswordNotFound {
        return userdao.getPassword(username,password);
    }
    @Override
    public User getUserbyname(String username) throws SQLException {
        return userdao.getUserbyname(username);
    }
}
