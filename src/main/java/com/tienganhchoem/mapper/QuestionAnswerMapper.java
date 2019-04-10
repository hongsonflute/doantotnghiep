package com.tienganhchoem.mapper;

import com.tienganhchoem.model.QuestionAnswerModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class QuestionAnswerMapper implements RowMapper<QuestionAnswerModel> {
    @Override
    public QuestionAnswerModel mapRow(ResultSet resultSet) {
        QuestionAnswerModel questionAnswerModel=new QuestionAnswerModel();
        try {
            questionAnswerModel.setLessionId(resultSet.getLong("idlession"));
            questionAnswerModel.setQuestionId(resultSet.getLong("idquestion"));
            questionAnswerModel.setAnswerId(resultSet.getLong("idanswer"));
            questionAnswerModel.setIsTrue(resultSet.getInt("istrue"));
            questionAnswerModel.setThumbnailQuestion(resultSet.getString("thumbnailquestion"));
            questionAnswerModel.setThumbnailAnswer(resultSet.getString("thumbnailanswer"));
            questionAnswerModel.setTitleQuestion(resultSet.getString("titlequestion"));
            questionAnswerModel.setLinkMp3Question(resultSet.getString("linkmp3question"));
            questionAnswerModel.setLinkMp3Answer(resultSet.getString("linkmp3answer"));
            questionAnswerModel.setNameAnswer(resultSet.getString("nameanswer"));
            return questionAnswerModel;
        } catch (SQLException e) {
            return null;
        }
    }
}
