package com.tienganhchoem.dao.impl;

import com.tienganhchoem.dao.ITracNghiemDAO;
import com.tienganhchoem.mapper.TracNghiemMapper;
import com.tienganhchoem.model.TracNghiemModel;

import java.util.List;

public class TracNghiemDAO extends AbstractDAO<TracNghiemModel> implements ITracNghiemDAO {
    @Override
    public List<TracNghiemModel> findByIdBaiTracNghiem(Long id) {
        String sql="select * from tracnghiem where idbaitracnghiem=?";
        List<TracNghiemModel> tracNghiemModels=query(sql,new TracNghiemMapper(),id);
        return tracNghiemModels;
    }

    @Override
    public Long save(TracNghiemModel tracNghiemModel) {
        StringBuilder sql = new StringBuilder("INSERT INTO tracnghiem (content,");
        sql.append(" answer_a, answer_b, answer_c, answer_d, answer_true, idbaitracnghiem, lessionid)");
        sql.append(" VALUES(?, ?, ?, ?, ?, ?, ?, ?)");
        return insert(sql.toString(),tracNghiemModel.getContent(),
                tracNghiemModel.getAnswerA(),tracNghiemModel.getAnswerB(),tracNghiemModel.getAnswerC(),tracNghiemModel.getAnswerD(),
                tracNghiemModel.getAnswerTrue(),tracNghiemModel.getIdBaiTracNghiem(),tracNghiemModel.getLessionid());
    }

    @Override
    public List<TracNghiemModel> findALL() {
        return null;
    }
}
