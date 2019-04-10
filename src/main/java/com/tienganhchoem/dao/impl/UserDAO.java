package com.tienganhchoem.dao.impl;

import com.tienganhchoem.dao.IUserDAO;
import com.tienganhchoem.mapper.UserMapper;
import com.tienganhchoem.model.UserModel;

import java.util.List;

public class UserDAO extends AbstractDAO<UserModel> implements IUserDAO {
    @Override
    public UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status) {
        StringBuilder sql = new StringBuilder("SELECT * FROM user AS u");
        sql.append(" INNER JOIN role AS r ON r.id = u.roleid");
        sql.append(" WHERE username = ? AND password = ? AND status = ?");
        List<UserModel> users = query(sql.toString(), new UserMapper(), userName, password, status);
        return users.isEmpty() ? null : users.get(0);
    }

    @Override
    public Long save(UserModel userModel) {
        StringBuilder sql = new StringBuilder("INSERT INTO user (username, password,");
        sql.append(" fullname, status, roleid, createddate, createdby)");
        sql.append(" VALUES(?, ?, ?, ?, ?, ?, ?)");
        return insert(sql.toString(), userModel.getUserName(),userModel.getPassword(),userModel.getFullName(),
                userModel.getStatus(),userModel.getRoleId(),userModel.getCreatedDate(),userModel.getCreatedBy());
    }

    @Override
    public UserModel findOne(Long id) {
        String sql = "SELECT * FROM user WHERE id = ?";
        List<UserModel> userModels = query(sql, new UserMapper(), id);
        return userModels.isEmpty() ? null : userModels.get(0);
    }

    @Override
    public boolean validate(UserModel userModel) {
        String sql = "SELECT * FROM user WHERE username = ?";
        List<UserModel> userModels = query(sql, new UserMapper(), userModel.getUserName());
        if(!userModels.isEmpty()){
            return false;
        }
        return true;
    }

    @Override
    public boolean update(UserModel userModelUpdate) {
        StringBuilder sql = new StringBuilder("UPDATE user SET username = ?, fullname = ?,");
        sql.append(" password = ?, modifieddate = ?, modifiedby = ? WHERE id = ?");

        return update(sql.toString(), userModelUpdate.getUserName(), userModelUpdate.getFullName(), userModelUpdate.getPassword(),
                userModelUpdate.getModifiedDate(), userModelUpdate.getModifiedBy(),userModelUpdate.getId());

    }

    @Override
    public List<UserModel> findAll() {
        StringBuilder sql =new StringBuilder("SELECT * FROM user as u");
        sql.append(" INNER JOIN role AS r ON r.id = u.roleid");
        sql.append(" WHERE 1=1");
        List<UserModel> userModels = query(sql.toString(), new UserMapper());
        return userModels.isEmpty() ? null : userModels;
    }

    @Override
    public void delete(Long id) {
        String sql = "DELETE FROM user WHERE id = ?";
        update(sql,id);
    }

    @Override
    public boolean adminEditAccount(UserModel userModelUpdate) {
        StringBuilder sql = new StringBuilder("UPDATE user SET username = ?, fullname = ?,");
        sql.append(" password = ?, roleid = ?, modifieddate = ?, modifiedby = ? WHERE id = ?");

        return update(sql.toString(), userModelUpdate.getUserName(), userModelUpdate.getFullName(), userModelUpdate.getPassword(),userModelUpdate.getRoleId(),
                userModelUpdate.getModifiedDate(), userModelUpdate.getModifiedBy(),userModelUpdate.getId());
    }

}
