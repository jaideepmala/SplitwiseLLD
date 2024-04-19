package com.amazon.hfchotel.test.splitwise;

import java.util.List;

public interface IGroupService {

    void addGroup(Group group);

    void addUsersGroup(Group group, List<User> users);

    void deleteGroup(Group group);

    void editGroup(final String groupId , final String groupName);

    void removeUsersFromGroup(Group group, List<User> users);
}
