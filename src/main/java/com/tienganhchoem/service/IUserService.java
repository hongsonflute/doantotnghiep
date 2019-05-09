package com.tienganhchoem.service;

import com.tienganhchoem.model.UserModel;

import java.util.List;

public interface IUserService {
    UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status);
    Long save( UserModel userModel);
    boolean update(UserModel userModelUpdate);
    UserModel findOne(long id);
    List<UserModel> findAll();
    boolean validateAddUser(UserModel userModel);
    void delete(long[] ids);
    boolean adminEditAccount(UserModel userModel);


}
