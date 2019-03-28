package com.tienganhchoem.service;

import com.tienganhchoem.model.UserModel;

public interface IUserService {
    UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status);
    Long save( UserModel userModel);
    UserModel findOne(long id);
}
