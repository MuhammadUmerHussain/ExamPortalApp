package com.example.ExamAppBackend;

import com.example.ExamAppBackend.models.Role;
import com.example.ExamAppBackend.models.User;
import com.example.ExamAppBackend.models.UserRole;
import com.example.ExamAppBackend.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class ExamAppBackendApplication implements CommandLineRunner {

	@Autowired
	UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ExamAppBackendApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		User u = new User();
		u.setUsername("User Don");
		u.setPassword("12231");
		u.setFirstName("Dany");

		Role r= new Role();
		r.setRoleId(1231L);
		r.setRoleName("ADMIN");

		Set<UserRole> US= new HashSet<>();

		UserRole urr=new UserRole();
		urr.setRole(r);
		urr.setUser(u);
		US.add(urr);
		this.userService.createUser(u,US);


	}
}
