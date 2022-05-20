package com.itse1907.bimatrauan.repository;

import com.itse1907.bimatrauan.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    List<User> findByEmail(String email);

    int countAllByRole(String role);

    List<User> findByRoleAndEmailNotOrderByIdDesc(String role, String email);
}