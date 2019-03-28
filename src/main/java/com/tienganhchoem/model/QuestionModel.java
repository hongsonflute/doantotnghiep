package com.tienganhchoem.model;

public class QuestionModel extends AbstractModel<QuestionModel> {
    private String content;
    private String name;
    private String code;
    private Long lessionId;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Long getLessionId() {
        return lessionId;
    }

    public void setLessionId(Long lessionId) {
        this.lessionId = lessionId;
    }
}
