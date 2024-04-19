package com.amazon.hfchotel.test.splitwise;

import java.util.List;

public class GroupBuilder {
    private String groupId;
    private String groupName;
    private List<User> users;
    private List<Expense> expenses;

    public GroupBuilder groupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    public GroupBuilder groupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    public GroupBuilder users(List<User> users) {
        this.users = users;
        return this;
    }

    public GroupBuilder expenses(List<Expense> expenses) {
        this.expenses = expenses;
        return this;
    }

    public Group build() {
        return new Group(groupId, groupName, users, expenses);
    }
}
