package com.tienganhchoem.dao;

import com.tienganhchoem.model.UserModel;

import java.util.List;

public interface IUserDAO extends GenericDAO<UserModel> {
    UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status);
    Long save(UserModel userModel);
    UserModel findOne(Long id);
    boolean validate(UserModel userModel);
    boolean update(UserModel userModelUpdate);
    List<UserModel> findAll();
    void delete(Long id);
    boolean adminEditAccount(UserModel userModel);
}
