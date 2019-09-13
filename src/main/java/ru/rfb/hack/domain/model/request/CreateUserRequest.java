package ru.rfb.hack.domain.model.request;

public class CreateUserRequest {

    private final String userName;
    private final String firstName;
    private final String lastName;
    private final String password;
    private final String email;

    public CreateUserRequest(String userName, String firstName, String lastName, String password, String email) {
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
