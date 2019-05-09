package com.tienganhchoem.dao.impl;

import com.tienganhchoem.dao.ICategoryDAO;
import com.tienganhchoem.mapper.CategoryMapper;
import com.tienganhchoem.model.CategoryModel;

import java.util.List;

public class CategoryDAO extends AbstractDAO<CategoryModel>implements ICategoryDAO {

    @Override
    public List<CategoryModel> findAll() {
        String sql="select * from category ";
        List<CategoryModel> categoryModels=query(sql, new CategoryMapper());
        return categoryModels;
    }

    @Override
    public CategoryModel findOne(long id) {
        return null;
    }

    @Override
    public CategoryModel findOneByCode(String code) {
        return null;
    }



}
