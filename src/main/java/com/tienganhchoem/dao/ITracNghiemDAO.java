package com.tienganhchoem.dao;

import com.tienganhchoem.model.TracNghiemModel;

import java.util.List;

public interface ITracNghiemDAO extends GenericDAO<TracNghiemModel>{
    List<TracNghiemModel> findByIdBaiTracNghiem(Long id);
    Long save(TracNghiemModel tracNghiemModel);
    List<TracNghiemModel> findALL();
}
