package com.amazon.hfchotel.test.splitwise;

public class UserBuilder {
    private String userId;
    private String userName;
    private String userEmail;

    public UserBuilder userId(String userId) {
        this.userId = userId;
        return this;
    }

    public UserBuilder userName(String userName) {
        this.userName = userName;
        return this;
    }

    public UserBuilder userEmail(String userEmail) {
        this.userEmail = userEmail;
        return this;
    }

    public User build() {
        return new User(userId, userName, userEmail);
    }
}
