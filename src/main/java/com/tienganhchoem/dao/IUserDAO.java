package com.tienganhchoem.dao;

import com.tienganhchoem.model.UserModel;

public interface IUserDAO extends GenericDAO<UserModel> {
    UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status);
    Long save(UserModel userModel);
    UserModel findOne(Long id);
    boolean validate(UserModel userModel);
}
