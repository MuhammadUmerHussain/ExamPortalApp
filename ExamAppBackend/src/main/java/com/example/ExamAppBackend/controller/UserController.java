package com.example.ExamAppBackend.controller;


import com.example.ExamAppBackend.models.Role;
import com.example.ExamAppBackend.models.User;
import com.example.ExamAppBackend.models.UserRole;
import com.example.ExamAppBackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashSet;
import java.util.Set;

@RestController
        @RequestMapping("/users")
public class UserController {


    @Autowired
    private UserService u;

    @PostMapping("/")
    public User createUser(@RequestBody User usr) throws Exception {
        Set<UserRole> roles=new HashSet<>();
        Role r=new Role();
        r.setRoleId(45L);
        r.setRoleName("Normal");

        UserRole uR=new UserRole();
        uR.setUser(usr);
        uR.setRole(r);
        roles.add(uR);
        return u.createUser(usr,roles);
    }

    @GetMapping("/{username}")
    public User getUser(@PathVariable("username") String username)
    {
        return u.getUser(username);
    }

    @DeleteMapping("/{username}")
    public  User deleteuser(@PathVariable("username") String username) throws Exception {

        return u.deleteUser(username);

    }
}
