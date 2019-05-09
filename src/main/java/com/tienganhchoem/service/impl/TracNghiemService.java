package com.tienganhchoem.service.impl;

import com.tienganhchoem.dao.ITracNghiemDAO;
import com.tienganhchoem.dao.impl.TracNghiemDAO;
import com.tienganhchoem.model.TracNghiemModel;
import com.tienganhchoem.service.ITracNghiemService;

import java.util.List;

public class TracNghiemService implements ITracNghiemService {
    private ITracNghiemDAO tracNghiemDAO;
    public TracNghiemService(){
        tracNghiemDAO=new TracNghiemDAO();
    }
    @Override
    public List<TracNghiemModel> findByIdBaiTracNghiem(Long id) {
        return tracNghiemDAO.findByIdBaiTracNghiem(id);
    }

    @Override
    public Long save(TracNghiemModel tracNghiemModel) {
       return tracNghiemDAO.save(tracNghiemModel);
    }
}
