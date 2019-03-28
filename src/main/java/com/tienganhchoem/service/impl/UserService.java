package com.tienganhchoem.service.impl;

import com.tienganhchoem.dao.IUserDAO;
import com.tienganhchoem.dao.impl.UserDAO;
import com.tienganhchoem.model.UserModel;
import com.tienganhchoem.service.IUserService;

public class UserService implements IUserService {

    private IUserDAO userDAO;

    public UserService() {
        userDAO = new UserDAO();
    }

    @Override
    public UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status) {
        return userDAO.findByUserNameAndPasswordAndStatus(userName, password, status);
    }

    @Override
    public Long save(UserModel userModel) {
        userModel.setStatus(1);
        userModel.setRoleId((long) 3);
        Long userID=userDAO.save(userModel);
        return userID;
    }

    @Override
    public UserModel findOne(long id) {
       UserModel model=userDAO.findOne(id);
       return model;
    }
}