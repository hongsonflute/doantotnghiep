package com.tienganhchoem.dao.impl;

import com.tienganhchoem.dao.ICommentDAO;
import com.tienganhchoem.mapper.CommentMapper;
import com.tienganhchoem.model.CommentModel;

import java.util.List;

public class CommentDAO extends AbstractDAO<CommentModel> implements ICommentDAO {
    @Override
    public Long save(CommentModel commentModel) {
        StringBuilder sql = new StringBuilder("INSERT INTO comment (content, user_id,");
        sql.append(" lession_id, createddate, createdby)");
        sql.append(" VALUES(?, ?, ?, ?, ?)");

        return insert(sql.toString(),commentModel.getContent(),commentModel.getUserId(),commentModel.getLessionId(),
                commentModel.getCreatedDate(), commentModel.getCreatedBy());

    }

    @Override
    public List<CommentModel> getAllByLessionId(Long lessionId) {
        String sql = "SELECT * FROM comment WHERE lession_id = ?";
        return query(sql, new CommentMapper(), lessionId);
    }

    @Override
    public boolean delete(Long commentId) {
        String sql = "DELETE FROM comment WHERE id = ?";
        return update(sql,commentId);
    }

    @Override
    public boolean update( CommentModel commentModel) {
        StringBuilder sql = new StringBuilder("UPDATE comment SET content = ?,");
        sql.append(" modifieddate = ?, modifiedby = ? WHERE id = ?");
        return update(sql.toString(),commentModel.getContent(),commentModel.getModifiedDate(),
                commentModel.getModifiedBy(),commentModel.getId());
    }
}
