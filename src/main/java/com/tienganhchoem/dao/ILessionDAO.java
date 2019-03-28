package com.tienganhchoem.dao;

import com.tienganhchoem.model.LessionModel;

import java.util.List;

public interface ILessionDAO extends GenericDAO<LessionModel> {
    LessionModel findOne(Long id);
    List<LessionModel> findByCategoryId(Long categoryId);
    Long save(LessionModel newModel);
    void update(LessionModel updateNew);
    void delete(long id);
}
