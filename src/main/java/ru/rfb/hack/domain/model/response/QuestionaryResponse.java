package ru.rfb.hack.domain.model.response;

public class QuestionaryResponse {

    private String id;

    public QuestionaryResponse(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
