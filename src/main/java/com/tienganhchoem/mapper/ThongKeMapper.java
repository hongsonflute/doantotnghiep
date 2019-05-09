package com.tienganhchoem.mapper;

import com.tienganhchoem.model.ThongKeModel;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class ThongKeMapper implements RowMapper<ThongKeModel> {
    @Override
    public ThongKeModel mapRow(ResultSet resultSet) {
        ThongKeModel thongKeModel = new ThongKeModel();
        try {
            //nếu trong bảng lấy về ko có tên đó, thì Resultset get tên đó sẽ lỗi==> nhảy sang catch luôn
            ResultSetMetaData rsmd = resultSet.getMetaData();//đọc ra các thông tin của rs
            if (rsmd.getColumnLabel(1).equals("countCategory")) {
                thongKeModel.setCountCategory(resultSet.getLong("countCategory"));
            } else if (rsmd.getColumnLabel(1).equals("countAccount")) {
                thongKeModel.setCountAccount(resultSet.getLong("countAccount"));
            } else if (rsmd.getColumnLabel(1).equals("countLession")) {
                thongKeModel.setCountLession(resultSet.getLong("countLession"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return thongKeModel;
    }
}
