package com.tienganhchoem.service.impl;

import com.tienganhchoem.dao.ICommentDAO;
import com.tienganhchoem.dao.impl.CommentDAO;
import com.tienganhchoem.model.CommentModel;
import com.tienganhchoem.service.ICommentService;

import java.sql.Timestamp;
import java.util.List;

public class CommentService implements ICommentService {
    private ICommentDAO commentDAO;
    public CommentService(){
        commentDAO=new CommentDAO();
    }
    @Override
    public Long save(CommentModel commentModel) {
        commentModel.setCreatedDate(new Timestamp(System.currentTimeMillis()));
        return commentDAO.save(commentModel);
    }

    @Override
    public List<CommentModel> getAllByLessionId(Long lessionId) {
       return commentDAO.getAllByLessionId(lessionId);
    }

    @Override
    public boolean delete(Long commentId) {
       return commentDAO.delete(commentId);
    }

    @Override
    public boolean update(CommentModel commentModel) {
        return commentDAO.update(commentModel);
    }
}
