package com.example.ExamAppBackend.service;

import com.example.ExamAppBackend.models.User;
import com.example.ExamAppBackend.models.UserRole;

import java.util.Set;

public interface UserService {
    public User createUser(User user, Set<UserRole> userRoles) throws Exception;
}
