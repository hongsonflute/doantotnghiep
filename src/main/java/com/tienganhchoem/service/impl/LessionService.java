package com.tienganhchoem.service.impl;

import com.tienganhchoem.dao.ILessionDAO;
import com.tienganhchoem.dao.impl.CategoryDAO;
import com.tienganhchoem.dao.impl.LessionDAO;
import com.tienganhchoem.model.CategoryModel;
import com.tienganhchoem.model.LessionModel;
import com.tienganhchoem.service.ILessionService;

import java.util.ArrayList;
import java.util.List;

public class LessionService implements ILessionService {
    private ILessionDAO lessionDAO;

    public LessionService() {
        lessionDAO = new LessionDAO();
    }

    @Override
    public List<LessionModel> findByCategoryId(Long categoryId) {
        return lessionDAO.findByCategoryId(categoryId);

    }

    @Override
    public LessionModel save(LessionModel lessionModel) {
        Long id= lessionDAO.save(lessionModel);
        return lessionDAO.findOne(id);
    }

    @Override
    public boolean update(LessionModel lessionModel) {

        return lessionDAO.update(lessionModel);
    }
    @Override
    public boolean delete(long[] ids) {
        for (long id : ids) {
            if(lessionDAO.delete(id)==true){
                continue;
            }
            return false;
        }
        return true;
    }
    @Override
    public LessionModel findOne(long id) {

        return lessionDAO.findOne(id);
    }

    @Override
    public List<LessionModel> findAll() {
        return lessionDAO.findAll();
    }

    @Override
    public List<LessionModel> findTop3ByCategoryId() {
        CategoryDAO categoryDAO=new CategoryDAO();
        List<LessionModel> lessionModels= new ArrayList<>();
        List<CategoryModel> categoryModels= categoryDAO.findAll();
        List<Long> ListIdCategory=new ArrayList<>();

        for (int i=0;i<categoryModels.size();i++){
            Long id=categoryModels.get(i).getId();
            ListIdCategory.add(id);
        }
        for (Long id:ListIdCategory){
           List<LessionModel> ListById=lessionDAO.findTop3ByCategoryId(id);
           lessionModels.addAll(ListById);
        }
        return lessionModels;
    }

    @Override
    public boolean tangView(Long lessionId) {
        return lessionDAO.tangView(lessionId);
    }
}
