package com.tienganhchoem.dao.impl;

import com.tienganhchoem.dao.ILessionDAO;
import com.tienganhchoem.mapper.LessionMapper;
import com.tienganhchoem.model.LessionModel;

import java.sql.Timestamp;
import java.util.List;

public class LessionDAO extends AbstractDAO<LessionModel> implements ILessionDAO {
    @Override
    public LessionModel findOne(Long id) {
        String sql = "SELECT * FROM lession WHERE id = ?";
        List<LessionModel> lessionModels = query(sql, new LessionMapper(), id);
        return lessionModels.isEmpty() ? null : lessionModels.get(0);
    }
    @Override
    public List<LessionModel> findByCategoryId(Long categoryId) {
        String sql = "SELECT * FROM lession WHERE categoryid = ?";
        return query(sql, new LessionMapper(), categoryId);
    }

    @Override
    public Long save(LessionModel lessionModel) {
        StringBuilder sql = new StringBuilder("INSERT INTO lession (title, thumbnail,");
        sql.append(" shortdescription, content, categoryid, createddate, createdby, view, video)");
        sql.append(" VALUES(?, ?, ?, ?, ?, ?, ?, 1, ?)");

        return insert(sql.toString(), lessionModel.getTitle(), lessionModel.getThumbnail(), lessionModel.getShortDescription(),
                lessionModel.getContent(), lessionModel.getCategoryId(), lessionModel.getCreatedDate(), lessionModel.getCreatedBy(), lessionModel.getVideo());
    }

    @Override
    public boolean update(LessionModel updateLession) {
        updateLession.setModifiedDate(new Timestamp(System.currentTimeMillis()));
        StringBuilder sql = new StringBuilder("UPDATE lession SET title= ?, thumbnail= ?,");
        sql.append(" shortdescription= ?, content= ?, categoryid= ?, modifieddate= ?, modifiedby= ? WHERE id = ?");
        return update(sql.toString(), updateLession.getTitle(), updateLession.getThumbnail(), updateLession.getShortDescription(),
                updateLession.getContent(), updateLession.getCategoryId(), updateLession.getModifiedDate(), updateLession.getModifiedBy(), updateLession.getId());

    }

    @Override
    public boolean delete(long id) {
        //dùng để xóa bài học
        //một bài học có nhiều câu hỏi, 1 câu hỏi có nhiều đáp án, NÊN XÓA TỪ BẢNG NHIỀU TRƯỚC :
        String sqlDeleteAnswer="delete from answer where questionid=?";
        String sqlDeleteQuestion = "delete from question WHERE lessionid = ?";
        String sqlDeleteLesstion = "delete from lession WHERE id = ?";
        if(update(sqlDeleteAnswer, id)==true){
            if(update(sqlDeleteQuestion,id)==true){
                if(update(sqlDeleteLesstion,id)==true){
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public List<LessionModel> findAll() {
        StringBuilder sql = new StringBuilder("SELECT * FROM lession as l");
        sql.append(" INNER JOIN category AS c ON c.id = l.categoryid");
        sql.append(" WHERE 1=1");
        List<LessionModel> lessionModels = query(sql.toString(), new LessionMapper());
        return lessionModels.isEmpty() ? null : lessionModels;
    }

    @Override
    public List<LessionModel> findTop3ByCategoryId(Long categoryId) {
        //dùng để lấy top 3 bài học có nhiều view nhất của 1 danh mục
        String sql="select *from lession  where categoryid=? order by view desc limit 3";
        List<LessionModel> lessionModels=query(sql,new LessionMapper(),categoryId);
        return lessionModels;
    }

    @Override
    public boolean tangView(Long lessionId) {
        String sql="update lession set view=view+1 where id=?";
        return update(sql,lessionId);
    }

    @Override
    public List<LessionModel> findByStatus(Long status) {
        String sql="select *from lession  where status=?";
        List<LessionModel> lessionModels=query(sql,new LessionMapper(),status);
        return lessionModels;
    }

    @Override
    public boolean changeStatusLession(Long status, Long lessionId) {
        String sql="update lession set status=? where id=?";
        return update(sql,status,lessionId);
    }
}
