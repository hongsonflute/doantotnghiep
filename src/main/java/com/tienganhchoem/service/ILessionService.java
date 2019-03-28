package com.tienganhchoem.service;

import com.tienganhchoem.model.LessionModel;
import com.tienganhchoem.paging.Pageble;

import java.util.List;

public interface ILessionService {
    List<LessionModel> findByCategoryId(Long categoryId);
    LessionModel save(LessionModel newModel);
    LessionModel update(LessionModel updateNew);
    void delete(long[] ids);
    LessionModel findOne(long id);
}
