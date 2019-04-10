package com.tienganhchoem.mapper;

import com.tienganhchoem.model.AnswerModel;
import com.tienganhchoem.model.CatQuestionModel;
import com.tienganhchoem.model.QuestionModel;

import java.sql.ResultSet;
import java.sql.SQLException;

public class QuestionMapper implements RowMapper<QuestionModel> {
    @Override
    public QuestionModel mapRow(ResultSet resultSet) {
        QuestionModel questionModel=new QuestionModel();
        try {
            questionModel.setTitle(resultSet.getString("title"));
            questionModel.setContent(resultSet.getString("content"));
            questionModel.setThumbnail(resultSet.getString("thumbnail"));
            questionModel.setShortDescription(resultSet.getString("shortdescription"));
            questionModel.setLinkMp3(resultSet.getString("linkmp3"));
            questionModel.setCatQuestionId(resultSet.getLong("catquestionid"));
            try {
                CatQuestionModel catQuestionModel=new CatQuestionModel();
                catQuestionModel.setName(resultSet.getString("name"));
                catQuestionModel.setCode(resultSet.getString("code"));

                questionModel.setCatQuestionModel(catQuestionModel);

                AnswerModel answerModel=new AnswerModel();
                answerModel.setContent(resultSet.getString("content"));
                answerModel.setTitle(resultSet.getString("title"));
                answerModel.setThumbnail(resultSet.getString("thumbnail"));
                answerModel.setTrue(resultSet.getBoolean("istrue"));

                questionModel.setAnswerModel(answerModel);

            }catch (Exception e){
                e.getMessage();
            }


        } catch (SQLException e) {
            e.printStackTrace();
        }
        return questionModel;
    }
}
