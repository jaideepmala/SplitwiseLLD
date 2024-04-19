package com.amazon.hfchotel.test.splitwise;

import java.util.List;
import java.util.Objects;

public class Group {

    private String groupId;
    private String groupName;

    private List<User> users;
    private List<Expense> expenses;

    public Group(final String groupId, final String groupName, final List<User> users) {

        this.groupId = groupId;
        this.groupName = groupName;
        this.users = users;
    }

    public Group(final String groupId, final String groupName, final List<User> users,
        final List<Expense> expenses) {

        this.groupId = groupId;
        this.groupName = groupName;
        this.users = users;
        this.expenses = expenses;
    }

    public String getGroupId() {

        return groupId;
    }

    public void setGroupId(final String groupId) {

        this.groupId = groupId;
    }

    public String getGroupName() {

        return groupName;
    }

    public void setGroupName(final String groupName) {

        this.groupName = groupName;
    }

    public List<User> getUsers() {

        return users;
    }

    public void setUsers(final List<User> users) {

        this.users = users;
    }

    public List<Expense> getExpenses() {

        return expenses;
    }

    public void setExpenses(final List<Expense> expenses) {

        this.expenses = expenses;
    }

    @Override
    public boolean equals(final Object o) {

        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        Group group = (Group) o;
        return Objects.equals(groupId, group.groupId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(groupId);
    }
}
