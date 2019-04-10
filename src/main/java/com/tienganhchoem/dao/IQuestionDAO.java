package com.tienganhchoem.dao;

import com.tienganhchoem.model.QuestionAnswerModel;
import com.tienganhchoem.model.QuestionModel;

import java.util.List;

public interface IQuestionDAO extends GenericDAO<QuestionModel> {
    Long save(QuestionModel questionModel);
    QuestionModel findOne (Long id);
    List<QuestionModel> findAll();
    List<QuestionAnswerModel> findByLessionIdAndQuestionId(Long lessionId,Long questionId);
}
