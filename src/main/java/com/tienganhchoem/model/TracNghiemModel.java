package com.tienganhchoem.model;

public class TracNghiemModel extends AbstractModel<TracNghiemModel>{

    private String content;
    private String answerA;
    private String answerB;
    private String answerC;
    private String answerD;
    private String answerTrue;
    private Long idBaiTracNghiem;
    private Long idCauHoiTracNghiem;
    private Long lessionid;

    public Long getLessionid() {
        return lessionid;
    }

    public void setLessionid(Long lessionid) {
        this.lessionid = lessionid;
    }

    public Long getIdCauHoiTracNghiem() {
        return idCauHoiTracNghiem;
    }

    public void setIdCauHoiTracNghiem(Long idCauHoiTracNghiem) {
        this.idCauHoiTracNghiem = idCauHoiTracNghiem;
    }

    public Long getIdBaiTracNghiem() {
        return idBaiTracNghiem;
    }

    public void setIdBaiTracNghiem(Long idBaiTracNghiem) {
        this.idBaiTracNghiem = idBaiTracNghiem;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getAnswerA() {
        return answerA;
    }

    public void setAnswerA(String answerA) {
        this.answerA = answerA;
    }

    public String getAnswerB() {
        return answerB;
    }

    public void setAnswerB(String answerB) {
        this.answerB = answerB;
    }

    public String getAnswerC() {
        return answerC;
    }

    public void setAnswerC(String answerC) {
        this.answerC = answerC;
    }

    public String getAnswerD() {
        return answerD;
    }

    public void setAnswerD(String answerD) {
        this.answerD = answerD;
    }

    public String getAnswerTrue() {
        return answerTrue;
    }

    public void setAnswerTrue(String answerTrue) {
        this.answerTrue = answerTrue;
    }
}
