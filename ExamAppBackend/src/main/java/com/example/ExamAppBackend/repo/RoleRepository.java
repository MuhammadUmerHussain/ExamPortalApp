package com.example.ExamAppBackend.repo;

import com.example.ExamAppBackend.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role,Long> {
}
