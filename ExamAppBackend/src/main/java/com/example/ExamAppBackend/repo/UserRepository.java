package com.example.ExamAppBackend.repo;

import com.example.ExamAppBackend.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Long
        > {
    User findByUsername(String username);
}
