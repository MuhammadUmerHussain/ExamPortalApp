package com.example.ExamAppBackend.service.implentationService;

import com.example.ExamAppBackend.models.User;
import com.example.ExamAppBackend.models.UserRole;
import com.example.ExamAppBackend.repo.RoleRepository;
import com.example.ExamAppBackend.repo.UserRepository;
import com.example.ExamAppBackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class UserImplementation implements UserService {

    @Autowired
    UserRepository userR;

    @Autowired
    RoleRepository repo;
    @Override
    public User createUser(User user, Set<UserRole> userRoles) throws Exception {

        User local=this.userR.findByUsername(user.getUsername());

        if(local!=null)
        {
            throw new Exception("Already Present User");


        }
        else{
            for(UserRole ur:userRoles)
            {
                repo.save(ur.getRole());
            }
            user.getUserRoles().addAll(userRoles);
             local=this.userR.save(user);
        }
        return local;
    }

    public User getUser(String Username){

        User u = userR.findByUsername(Username);

        return u;
}
    public User deleteUser(String Username) throws Exception {

        User u=userR.findByUsername(Username);
        if(u!=null)
        {
            userR.delete(u);


        }
        else{
            throw new Exception("User not found");
        }
        return u;
    }
}
