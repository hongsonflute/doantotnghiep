package com.tienganhchoem.model;

public class CommentModel extends AbstractModel<CommentModel> {
    private String content;
    private Long userId;
    private Long lessionId;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getLessionId() {
        return lessionId;
    }

    public void setLessionId(Long lessionId) {
        this.lessionId = lessionId;
    }
}

