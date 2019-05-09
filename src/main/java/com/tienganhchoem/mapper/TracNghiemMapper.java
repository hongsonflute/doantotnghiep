package com.tienganhchoem.mapper;

import com.tienganhchoem.model.TracNghiemModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TracNghiemMapper implements RowMapper<TracNghiemModel> {
    @Override
    public TracNghiemModel mapRow(ResultSet resultSet) {
        TracNghiemModel tracNghiemModel=new TracNghiemModel();
        try {
            tracNghiemModel.setContent(resultSet.getString("content"));
            tracNghiemModel.setAnswerA(resultSet.getString("answer_a"));
            tracNghiemModel.setAnswerB(resultSet.getString("answer_b"));
            tracNghiemModel.setAnswerC(resultSet.getString("answer_c"));
            tracNghiemModel.setAnswerD(resultSet.getString("answer_d"));
            tracNghiemModel.setAnswerTrue(resultSet.getString("answer_true"));
            tracNghiemModel.setIdBaiTracNghiem(resultSet.getLong("idbaitracnghiem"));
            tracNghiemModel.setIdCauHoiTracNghiem(resultSet.getLong("idcauhoitracnghiem"));
            tracNghiemModel.setLessionid(resultSet.getLong("lessionid"));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return tracNghiemModel;
    }
}
