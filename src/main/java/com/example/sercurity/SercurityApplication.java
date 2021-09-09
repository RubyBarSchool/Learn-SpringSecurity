package com.example.sercurity;

import com.example.sercurity.domain.Role;
import com.example.sercurity.domain.User;
import com.example.sercurity.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class SercurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SercurityApplication.class, args);
	}

	CommandLineRunner runner(UserService userService){
		return args -> {
		        userService.saveRole(new Role(null,"ROLE_USER"));
			userService.saveRole(new Role(null,"ROLE_MANAGER"));
			userService.saveRole(new Role(null,"ROLE_ADMIN"));
			userService.saveRole(new Role(null,"ROLE_SUPER_ADMIN"));

			userService.saveUser(new User(null,"Tran Vu Truong","truongtv1399it","123456",new ArrayList<>()));
			userService.saveUser(new User(null,"Le Thi Ngoc","truongtv1399","123456",new ArrayList<>()));
			userService.saveUser(new User(null,"Tran Vu A","truongtv13","123456",new ArrayList<>()));
			userService.saveUser(new User(null,"Tran Vu B","truongtv","123456",new ArrayList<>()));

			userService.addRoleToUser("truongtv1399it","ROLE_SUPER_ADMIN");
			userService.addRoleToUser("truongtv1399it","ROLE_ADMIN");
			userService.addRoleToUser("truongtv1399it","ROLE_MANAGER");
			userService.addRoleToUser("truongtv1399","ROLE_USER");
			userService.addRoleToUser("truongtv13","ROLE_MANAGER");
			userService.addRoleToUser("truongtv","ROLE_USER");



		};
	}
}
