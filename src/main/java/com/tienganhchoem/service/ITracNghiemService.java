package com.tienganhchoem.service;

import com.tienganhchoem.model.TracNghiemModel;

import java.util.List;

public interface ITracNghiemService {
    List<TracNghiemModel> findByIdBaiTracNghiem(Long id);
    Long save (TracNghiemModel tracNghiemModel);
}
