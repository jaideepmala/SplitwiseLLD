package com.amazon.hfchotel.test.splitwise;

import java.util.HashMap;
import java.util.Map;

public class UserService implements IUserService {

    private Map<String, User> userMap;

    public UserService() {

        userMap = new HashMap<>();
    }

    public UserService(final Map<String, User> userMap) {

        this.userMap = userMap;
    }

    @Override
    public void adduser(final User user) {

        userMap.put(user.getUserId(), user);
    }

    @Override
    public void removeUser(final User user) {

        userMap.remove(user.getUserId());
    }
}
