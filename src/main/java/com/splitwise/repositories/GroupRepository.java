package com.splitwise.repositories;

import com.splitwise.models.Group;

import java.util.List;

// @Repository // extends JpaRepository<Group, Long>
public interface GroupRepository {
    Group save(Group group);
    Group findGroupById(long id);
    List<Group> getGroupsForAUser(long id);
}
