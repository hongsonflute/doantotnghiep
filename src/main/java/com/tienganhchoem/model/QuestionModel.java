package com.tienganhchoem.model;

public class QuestionModel extends AbstractModel<QuestionModel> {
    private String name;
    private String title;
    private  String thumbnail;
    private  String shortDescription;
    private  String linkMp3;
    private String content;
    private Long lessionId;
    private Long catQuestionId;
    private AnswerModel answerModel;
    private CatQuestionModel catQuestionModel;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AnswerModel getAnswerModel() {
        return answerModel;
    }

    public void setAnswerModel(AnswerModel answerModel) {
        this.answerModel = answerModel;
    }

    public CatQuestionModel getCatQuestionModel() {
        return catQuestionModel;
    }

    public void setCatQuestionModel(CatQuestionModel catQuestionModel) {
        this.catQuestionModel = catQuestionModel;
    }

    public Long getCatQuestionId() {
        return catQuestionId;
    }

    public void setCatQuestionId(Long catQuestionId) {
        this.catQuestionId = catQuestionId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getLinkMp3() {
        return linkMp3;
    }

    public void setLinkMp3(String linkMp3) {
        this.linkMp3 = linkMp3;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getLessionId() {
        return lessionId;
    }

    public void setLessionId(Long lessionId) {
        this.lessionId = lessionId;
    }

}
