package com.tienganhchoem.dao;

import com.tienganhchoem.dao.impl.ThanhTichDAO;
import com.tienganhchoem.model.ThanhTichModel;

import java.util.List;

public interface IThanhTichDAO extends GenericDAO<ThanhTichModel>{
    Long save (ThanhTichModel thanhTichModel);
    Long checkTonTai(Long userId, Long idbaitracnghiem);
    boolean update(Long idUpdate, ThanhTichModel thanhTichModel);
    List<ThanhTichModel> findByUserId(Long userId);
}
