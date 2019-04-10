package com.tienganhchoem.service;

import com.tienganhchoem.model.QuestionAnswerModel;

import java.util.List;

public interface IQuestionService {
    List<QuestionAnswerModel> findByLessionIdAndQuestionId(Long lessionId, Long questionId);
}
