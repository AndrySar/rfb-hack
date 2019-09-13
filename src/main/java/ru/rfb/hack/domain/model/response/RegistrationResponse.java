package ru.rfb.hack.domain.model.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RegistrationResponse {

    @JsonProperty("username")
    private String userName;

    @JsonIgnore
    private String error;

    public RegistrationResponse(String userName, String error) {
        this.userName = userName;
        this.error = error;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
