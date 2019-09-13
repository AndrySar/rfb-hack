package ru.rfb.hack.domain.model.response;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class AuthResponse {

    @JsonProperty("username")
    private String userName;

    @JsonProperty("token")
    private String token;

    @JsonIgnore
    private String error;

    public AuthResponse(String userName, String token) {
        this.userName = userName;
        this.token = token;
    }

    public AuthResponse(String error) {
        this.error = error;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
