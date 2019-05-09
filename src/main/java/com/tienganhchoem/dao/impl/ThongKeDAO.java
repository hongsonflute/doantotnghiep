package com.tienganhchoem.dao.impl;

import com.tienganhchoem.dao.IThongKeDAO;
import com.tienganhchoem.mapper.ThongKeMapper;
import com.tienganhchoem.model.ThongKeModel;

import java.util.List;

public class ThongKeDAO extends AbstractDAO<ThongKeModel> implements IThongKeDAO {
    @Override
    public Long countCategory() {
       String sql="select count(*) as countCategory from category";
        List<ThongKeModel> thongKeModels=query(sql,new ThongKeMapper());
        return thongKeModels.get(0).getCountCategory();
    }

    @Override
    public Long countLession() {
       String sql="select count(*) as countLession from lession";
       List<ThongKeModel> thongKeModels=query(sql,new ThongKeMapper());
       return thongKeModels.get(0).getCountLession();
    }

    @Override
    public Long countAccount() {
        String sql="select count(*) as countAccount from user";
        List<ThongKeModel> thongKeModels=query(sql,new ThongKeMapper());
        return thongKeModels.get(0).getCountAccount();
    }
}
