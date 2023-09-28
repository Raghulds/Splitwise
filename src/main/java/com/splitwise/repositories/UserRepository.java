package com.splitwise.repositories;

import com.splitwise.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.relational.core.mapping.Table;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Table("users")
public interface UserRepository extends JpaRepository<User, Long> {
    User save(User user);
    User findUserById(long id);
    List<User> findUserByUserNameAndPhone(String userName, String phone);
}
