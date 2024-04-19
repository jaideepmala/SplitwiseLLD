package com.amazon.hfchotel.test.splitwise;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupService implements IGroupService {

    private Map<String, Group> groupMap;

    public GroupService() {

        groupMap = new HashMap<>();
    }

    @Override
    public void addGroup(final Group group) {

        groupMap.put(group.getGroupId(), group);
    }

    @Override
    public void addUsersGroup(final Group group, final List<User> users) {

        List<User> currentUsers = group.getUsers();
        currentUsers.addAll(users);
        group.setUsers(currentUsers);
        groupMap.put(group.getGroupId(), group);
    }

    @Override
    public void deleteGroup(final Group group) {

        groupMap.remove(group.getGroupId());
    }

    @Override
    public void editGroup(final String groupId, final String groupName) {

        Group group = groupMap.get(groupId);
        group.setGroupName(groupName);
    }

    @Override
    public void removeUsersFromGroup(final Group group, final List<User> users) {

        List<User> currentUsers = group.getUsers();
        currentUsers.removeAll(users);
        group.setUsers(currentUsers);
        groupMap.put(group.getGroupId(), group);
    }
}
