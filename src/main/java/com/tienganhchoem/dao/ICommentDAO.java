package com.tienganhchoem.dao;

import com.tienganhchoem.model.CommentModel;

import java.util.List;

public interface ICommentDAO extends GenericDAO<CommentModel> {
    Long save(CommentModel commentModel);
    List<CommentModel> getAllByLessionId(Long lessionId);
    boolean delete(Long commentId);
    boolean update(CommentModel commentModel);
}
