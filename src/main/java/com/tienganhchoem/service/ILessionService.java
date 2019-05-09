package com.tienganhchoem.service;

import com.tienganhchoem.model.LessionModel;
import com.tienganhchoem.paging.Pageble;

import java.util.List;

public interface ILessionService {
    List<LessionModel> findByCategoryId(Long categoryId);
    LessionModel save(LessionModel lessionModel);
    boolean update(LessionModel updateNew);
    boolean delete(long[] ids);
    LessionModel findOne(long id);
    List<LessionModel> findAll();
    List<LessionModel> findTop3ByCategoryId();
    boolean tangView(Long lessionId);
    List<LessionModel> findByStatus(Long status);
    boolean changeStatusLession(Long status, long[] idlession);
    boolean HuyDuyet(Long status, long[] idlession);
}
