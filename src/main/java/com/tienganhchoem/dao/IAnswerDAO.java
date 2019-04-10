package com.tienganhchoem.dao;

import com.tienganhchoem.model.AnswerModel;

public interface IAnswerDAO extends GenericDAO<AnswerModel> {
    Long save(AnswerModel answerModel);

}
