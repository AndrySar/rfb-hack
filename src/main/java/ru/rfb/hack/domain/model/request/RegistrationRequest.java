package ru.rfb.hack.domain.model.request;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class RegistrationRequest {

    private final String userName;
    private final String firstName;
    private final String lastName;
    private final String password;
    private final String email;

    @JsonCreator
    public RegistrationRequest(@JsonProperty("username") String userName,
                               @JsonProperty("firstname") String firstName,
                               @JsonProperty("lastname") String lastName,
                               @JsonProperty("password") String password,
                               @JsonProperty("email") String email) {
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }
}
