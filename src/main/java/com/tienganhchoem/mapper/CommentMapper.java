package com.tienganhchoem.mapper;

import com.tienganhchoem.model.CommentModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class CommentMapper implements RowMapper<CommentModel>{

    @Override
    public CommentModel mapRow(ResultSet resultSet) {
        try {
            CommentModel commentModel=new CommentModel();
            commentModel.setId(resultSet.getLong("id"));
            commentModel.setContent(resultSet.getString("content"));
            commentModel.setUserId(resultSet.getLong("user_id"));
            commentModel.setLessionId(resultSet.getLong("lession_id"));
            commentModel.setCreatedBy(resultSet.getString("createdby"));
            commentModel.setCreatedDate(resultSet.getTimestamp("createddate"));
            return commentModel;
        }
       catch (SQLException e){
            return null;
       }
    }
}
