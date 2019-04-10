package com.tienganhchoem.service.impl;

import com.tienganhchoem.dao.IUserDAO;
import com.tienganhchoem.dao.impl.UserDAO;
import com.tienganhchoem.model.UserModel;
import com.tienganhchoem.service.IUserService;

import java.sql.Timestamp;
import java.util.List;

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
        userModel.setCreatedDate(new Timestamp(System.currentTimeMillis()));
        Long userID = userDAO.save(userModel);
        return userID;
    }

    @Override
    public boolean update(UserModel userModelUpdate) {
        userModelUpdate.setModifiedDate(new Timestamp(System.currentTimeMillis()));
        userModelUpdate.setModifiedBy(userModelUpdate.getUserName());
        return userDAO.update(userModelUpdate);
    }

    @Override
    public UserModel findOne(long id) {
        UserModel model = userDAO.findOne(id);
        return model;
    }

    @Override
    public List<UserModel> findAll() {
        return userDAO.findAll();
    }

    @Override
    public boolean validateAddUser(UserModel userModel) {
        return userDAO.validate(userModel);
    }

    @Override
    public void delete(long[] ids) {
        for (long id : ids) {
            userDAO.delete(id);
        }
    }

    @Override
    public boolean adminEditAccount(UserModel userModel) {
        userModel.setModifiedDate(new Timestamp(System.currentTimeMillis()));
       return userDAO.adminEditAccount(userModel);
    }
}