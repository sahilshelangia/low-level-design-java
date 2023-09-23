package org.lld.splitwise.group;

import org.lld.splitwise.user.User;

import java.util.ArrayList;
import java.util.List;

public class GroupController {
    List<Group> groups;

    public GroupController() {
        groups = new ArrayList<>();
    }

    public Group createGroup(String id, String description, User createdBy) {
        Group group = new Group(id, description);
        group.addMember(createdBy);
        groups.add(group);
        return group;
    }

    public Group getGroupById(String id) {
        for (Group group : groups) {
            if (group.getId() == id) {
                return group;
            }
        }
        return null;
    }

}
