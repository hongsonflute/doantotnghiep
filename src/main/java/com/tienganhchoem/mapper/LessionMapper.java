package com.tienganhchoem.mapper;

import com.tienganhchoem.model.CategoryModel;
import com.tienganhchoem.model.LessionModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class LessionMapper implements RowMapper<LessionModel> {
    @Override
    public LessionModel mapRow(ResultSet resultSet) {
        try {
            LessionModel lession = new LessionModel();
            lession.setId(resultSet.getLong("id"));
            lession.setCategoryId(resultSet.getLong("categoryid"));
            lession.setContent(resultSet.getString("content"));
            lession.setShortDescription(resultSet.getString("shortdescription"));
            lession.setTitle(resultSet.getString("title"));
            lession.setThumbnail(resultSet.getString("thumbnail"));
            lession.setCreatedBy(resultSet.getString("createdby"));
            lession.setCreatedDate(resultSet.getTimestamp("createddate"));
            lession.setVideo(resultSet.getString("video"));
            try {
                CategoryModel categoryModel=new CategoryModel();
                categoryModel.setCode(resultSet.getString("code"));
                categoryModel.setName(resultSet.getString("name"));
                lession.setCategoryModel(categoryModel);
            }catch (Exception e){
                e.getMessage();
            }
            return lession;
        } catch (SQLException e) {
            return null;
        }
    }
}
