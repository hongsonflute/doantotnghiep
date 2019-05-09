package com.tienganhchoem.mapper;

import com.tienganhchoem.model.ThanhTichModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ThanhTichMapper implements RowMapper<ThanhTichModel> {
    @Override
    public ThanhTichModel mapRow(ResultSet resultSet) {
        try {
            ThanhTichModel thanhTichModel=new ThanhTichModel();
            thanhTichModel.setId(resultSet.getLong("id"));
            thanhTichModel.setDiemString(resultSet.getString("tongdiem"));
            thanhTichModel.setIdBaiTracNghiem(resultSet.getLong("idbaihoctracnghiem"));
            thanhTichModel.setUserId(resultSet.getLong("iduser"));
            thanhTichModel.setSoLanLam(resultSet.getLong("lanlamthu"));
            return  thanhTichModel;
        }
        catch (SQLException e){
            return null;
        }
    }
}
