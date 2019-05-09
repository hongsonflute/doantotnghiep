package com.tienganhchoem.service.impl;

import com.tienganhchoem.dao.IThanhTichDAO;
import com.tienganhchoem.dao.impl.ThanhTichDAO;
import com.tienganhchoem.model.ThanhTichModel;
import com.tienganhchoem.service.IThanhTichService;

import java.util.List;

public class ThanhTichService implements IThanhTichService {
    private IThanhTichDAO thanhTichDAO;
    public ThanhTichService(){
        thanhTichDAO=new ThanhTichDAO();
    }
    @Override
    public Long save(ThanhTichModel thanhTichModel) {
        return thanhTichDAO.save(thanhTichModel);
    }

    @Override
    public Long checkTonTai(Long userId, Long idbaitracnghiem) {
       return thanhTichDAO.checkTonTai(userId,idbaitracnghiem);
    }

    @Override
    public boolean update(Long idUpdate,ThanhTichModel thanhTichModel) {
       return thanhTichDAO.update(idUpdate,thanhTichModel);
    }

    @Override
    public List<ThanhTichModel> findByUserId(Long userId) {
        return  thanhTichDAO.findByUserId(userId);
    }
}
