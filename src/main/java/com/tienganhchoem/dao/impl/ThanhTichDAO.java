package com.tienganhchoem.dao.impl;

import com.tienganhchoem.dao.IThanhTichDAO;
import com.tienganhchoem.mapper.ThanhTichMapper;
import com.tienganhchoem.mapper.TracNghiemMapper;
import com.tienganhchoem.model.ThanhTichModel;
import com.tienganhchoem.model.TracNghiemModel;

import java.util.List;

public class ThanhTichDAO extends AbstractDAO<ThanhTichModel> implements IThanhTichDAO {

    @Override
    public Long save(ThanhTichModel thanhTichModel) {
        StringBuilder sql = new StringBuilder("INSERT INTO thanhtich (iduser, tongdiem, lanlamthu,");
        sql.append(" idbaihoctracnghiem, lessionid)");
        sql.append(" VALUES(?, ?,1, ?,?)");
       return insert(sql.toString(),thanhTichModel.getUserId(),thanhTichModel.getDiemString(),
               thanhTichModel.getIdBaiTracNghiem(),thanhTichModel.getLessionid());
    }

    @Override
    public Long checkTonTai(Long userId, Long idbaitracnghiem) {
        String sql = "SELECT * FROM thanhtich WHERE iduser = ? and idbaihoctracnghiem= ? ";
        List<ThanhTichModel> thanhTichModels  = query(sql, new ThanhTichMapper(),userId,idbaitracnghiem);
        if(!thanhTichModels.isEmpty()){
            return thanhTichModels.get(0).getId();
        }
        return null;
    }

    @Override
    public boolean update(Long idUpdate,ThanhTichModel thanhTichModel) {
        StringBuilder sql = new StringBuilder("UPDATE thanhtich SET tongdiem = ?,");
        sql.append(" lanlamthu =lanlamthu+1 WHERE id = ?");
        return update(sql.toString(),thanhTichModel.getDiemString(),idUpdate);
    }

    @Override
    public List<ThanhTichModel> findByUserId(Long userId) {
        StringBuilder sql =new StringBuilder("SELECT * FROM thanhtich where iduser=?");
        List<ThanhTichModel> thanhTichModels = query(sql.toString(), new ThanhTichMapper(),userId);
        return thanhTichModels.isEmpty() ? null : thanhTichModels;
    }
}
