package ru.rfb.hack.domain.model.response;

public class QuestionaryDataResponse {

    private String data;

    public QuestionaryDataResponse(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
