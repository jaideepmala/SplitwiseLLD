package com.amazon.hfchotel.test.splitwise;

import java.util.Objects;

public class User {

    private String userId;
    private String userName;
    private String UserEmail;


    public User(final String userId, final String userName, final String userEmail) {
        this.userId = userId;
        this.userName = userName;
        this.UserEmail = userEmail;
    }

    public String getUserId() {

        return userId;
    }

    public void setUserId(final String userId) {

        this.userId = userId;
    }

    public String getUserName() {

        return userName;
    }

    public void setUserName(final String userName) {

        this.userName = userName;
    }

    public String getUserEmail() {

        return UserEmail;
    }

    public void setUserEmail(final String userEmail) {

        UserEmail = userEmail;
    }

    @Override
    public boolean equals(final Object o) {

        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        User users = (User) o;
        return Objects.equals(userId, users.userId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(userId);
    }
}
