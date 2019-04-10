package com.tienganhchoem.service.impl;

import com.tienganhchoem.dao.IQuestionDAO;
import com.tienganhchoem.dao.impl.QuestionDAO;
import com.tienganhchoem.model.QuestionAnswerModel;
import com.tienganhchoem.service.IQuestionService;

import java.util.List;

public class QuestionService implements IQuestionService {
    private IQuestionDAO iQuestionDAO;

    public QuestionService() {
        iQuestionDAO = new QuestionDAO();
    }
    @Override
    public List<QuestionAnswerModel> findByLessionIdAndQuestionId(Long lessionId, Long questionId) {
        return iQuestionDAO.findByLessionIdAndQuestionId(lessionId, questionId);
    }
}
