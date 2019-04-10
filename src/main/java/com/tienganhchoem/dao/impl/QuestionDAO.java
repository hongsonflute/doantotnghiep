package com.tienganhchoem.dao.impl;

import com.tienganhchoem.dao.IQuestionDAO;
import com.tienganhchoem.mapper.QuestionAnswerMapper;
import com.tienganhchoem.model.QuestionAnswerModel;
import com.tienganhchoem.model.QuestionModel;

import java.util.List;

public class QuestionDAO extends AbstractDAO<QuestionModel> implements IQuestionDAO {
    @Override
    public Long save(QuestionModel questionModel) {
        return null;
    }

    @Override
    public QuestionModel findOne(Long id) {
        return null;
    }

    @Override
    public List<QuestionModel> findAll() {
        return null;
    }

    @Override
    public List<QuestionAnswerModel> findByLessionIdAndQuestionId(Long lessionId, Long questionId) {
        StringBuilder sql = new StringBuilder("SELECT  l.id as idlession,q.id as idquestion, a.id as idanswer,q.title as titlequestion,");
        sql.append(" q.thumbnail as thumbnailquestion,q.linkmp3 as linkmp3question,a.nameanswer,");
        sql.append(" a.thumbnail as thumbnailanswer,a.isTrue ,a.linkmp3 as linkmp3answer");
        sql.append(" FROM lession l inner join question q on l.id=q.lessionid ");
        sql.append(" inner join answer a on q.id=a.questionid where l.id=? having q.id=?");

        List<QuestionAnswerModel> questionAnswerModels=query(sql.toString(),new QuestionAnswerMapper(),lessionId,questionId);
        return questionAnswerModels.isEmpty()?null: questionAnswerModels;
    }


}
