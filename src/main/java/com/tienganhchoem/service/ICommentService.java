package com.tienganhchoem.service;

import com.tienganhchoem.model.CommentModel;

import java.util.List;

public interface ICommentService {
    Long save(CommentModel commentModel);
    List<CommentModel> getAllByLessionId( Long lessionId);
    boolean delete(Long commentId);
    boolean update(CommentModel commentModel);
}
