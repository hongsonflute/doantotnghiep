package com.tienganhchoem.service;

import com.tienganhchoem.model.ThanhTichModel;

import java.util.List;

public interface IThanhTichService {
    Long save (ThanhTichModel thanhTichModel);
    Long checkTonTai(Long userId, Long idbaitracnghiem);
    boolean update(Long idUpdate,ThanhTichModel thanhTichModel);
    List<ThanhTichModel> findByUserId(Long userId);
}
