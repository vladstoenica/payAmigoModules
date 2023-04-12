package com.example.payAmigo.repository;

import com.example.payAmigo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    User save(User user);
    void deleteByUserId(Integer id);
    User findById(Integer id);
    User findByEmail(String email);
    User findByName(String name);
}
