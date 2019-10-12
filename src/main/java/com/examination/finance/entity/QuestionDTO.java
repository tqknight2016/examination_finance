package com.examination.finance.entity;

public class QuestionDTO {
    private Integer id;
    private String topic;
    private String opitionA;
    private String opitionB;
    private String opitionC;
    private String opitionD;
    private String opitionE;
    private String opitionF;
    private String answer;
    private String book;
    private String chapter;
    private String answerDetail;
    private String updatedTime;
    private String createdTime;
    private String updatedBy;
    private String createdBy;

    @Override
    public String toString() {
        return "QuestionDTO{" +
                "id=" + id +
                ", topic='" + topic + '\'' +
                ", opitionA='" + opitionA + '\'' +
                ", opitionB='" + opitionB + '\'' +
                ", opitionC='" + opitionC + '\'' +
                ", opitionD='" + opitionD + '\'' +
                ", opitionE='" + opitionE + '\'' +
                ", opitionF='" + opitionF + '\'' +
                ", answer='" + answer + '\'' +
                ", book='" + book + '\'' +
                ", chapter='" + chapter + '\'' +
                ", answerDetail='" + answerDetail + '\'' +
                ", updatedTime='" + updatedTime + '\'' +
                ", createdTime='" + createdTime + '\'' +
                ", updatedBy='" + updatedBy + '\'' +
                ", createdBy='" + createdBy + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getOpitionA() {
        return opitionA;
    }

    public void setOpitionA(String opitionA) {
        this.opitionA = opitionA;
    }

    public String getOpitionB() {
        return opitionB;
    }

    public void setOpitionB(String opitionB) {
        this.opitionB = opitionB;
    }

    public String getOpitionC() {
        return opitionC;
    }

    public void setOpitionC(String opitionC) {
        this.opitionC = opitionC;
    }

    public String getOpitionD() {
        return opitionD;
    }

    public void setOpitionD(String opitionD) {
        this.opitionD = opitionD;
    }

    public String getOpitionE() {
        return opitionE;
    }

    public void setOpitionE(String opitionE) {
        this.opitionE = opitionE;
    }

    public String getOpitionF() {
        return opitionF;
    }

    public void setOpitionF(String opitionF) {
        this.opitionF = opitionF;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getChapter() {
        return chapter;
    }

    public void setChapter(String chapter) {
        this.chapter = chapter;
    }

    public String getAnswerDetail() {
        return answerDetail;
    }

    public void setAnswerDetail(String answerDetail) {
        this.answerDetail = answerDetail;
    }

    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }
}
