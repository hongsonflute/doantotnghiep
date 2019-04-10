package com.tienganhchoem.service.impl;

import com.tienganhchoem.dao.impl.CategoryDAO;
import com.tienganhchoem.model.CategoryModel;
import com.tienganhchoem.service.ICategoryService;

import java.util.List;

public class CategoryService implements ICategoryService {
    @Override
    public List<CategoryModel> findAll() {
        CategoryDAO categoryDAO=new CategoryDAO();
        return categoryDAO.findAll();
    }
}
