package com.tienganhchoem.dao;

import com.tienganhchoem.model.LessionModel;

import java.util.List;

public interface ILessionDAO extends GenericDAO<LessionModel> {
    LessionModel findOne(Long id);
    List<LessionModel> findByCategoryId(Long categoryId);
    Long save(LessionModel lessionModel);
    boolean update(LessionModel updateNew);
    boolean delete(long id);
    List<LessionModel> findAll();
    List<LessionModel> findTop3ByCategoryId(Long categoryId);
    boolean tangView(Long lessionId);
}
