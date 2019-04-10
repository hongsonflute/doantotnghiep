package com.tienganhchoem.model;

public class QuestionAnswerModel {

    private Long lessionId;
    private Long questionId;
    private Long answerId;
    private String titleQuestion;
    private String thumbnailQuestion;
    private String linkMp3Question;
    private String thumbnailAnswer;
    private int isTrue;
    private String linkMp3Answer;
    private String nameAnswer;

    public String getNameAnswer() {
        return nameAnswer;
    }

    public void setNameAnswer(String nameAnswer) {
        this.nameAnswer = nameAnswer;
    }

    public Long getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Long answerId) {
        this.answerId = answerId;
    }

    public Long getLessionId() {
        return lessionId;
    }

    public void setLessionId(Long lessionId) {
        this.lessionId = lessionId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getTitleQuestion() {
        return titleQuestion;
    }

    public void setTitleQuestion(String titleQuestion) {
        this.titleQuestion = titleQuestion;
    }

    public String getThumbnailQuestion() {
        return thumbnailQuestion;
    }

    public void setThumbnailQuestion(String thumbnailQuestion) {
        this.thumbnailQuestion = thumbnailQuestion;
    }

    public String getLinkMp3Question() {
        return linkMp3Question;
    }

    public void setLinkMp3Question(String linkMp3Question) {
        this.linkMp3Question = linkMp3Question;
    }

    public String getThumbnailAnswer() {
        return thumbnailAnswer;
    }

    public void setThumbnailAnswer(String thumbnailAnswer) {
        this.thumbnailAnswer = thumbnailAnswer;
    }

    public int getIsTrue() {
        return isTrue;
    }

    public void setIsTrue(int isTrue) {
        this.isTrue = isTrue;
    }

    public String getLinkMp3Answer() {
        return linkMp3Answer;
    }

    public void setLinkMp3Answer(String linkMp3Answer) {
        this.linkMp3Answer = linkMp3Answer;
    }
}
