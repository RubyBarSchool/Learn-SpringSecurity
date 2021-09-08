package com.example.sercurity.service.impl;

import com.example.sercurity.domain.Role;
import com.example.sercurity.domain.User;
import com.example.sercurity.repo.RoleRepo;
import com.example.sercurity.repo.UserRepo;
import com.example.sercurity.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@Slf4j
public class UserServiceImpl implements UserService {
    @Autowired
    private  UserRepo userRepo;

    @Autowired
    private   RoleRepo roleRepo;

    @Override
    public User saveUser(User user) {
        log.info("Saving new user to database");
        return userRepo.save(user);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("Saving new Role {} to database",role.getName());
        return roleRepo.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        User user = userRepo.findByUsername(username);
        Role role = roleRepo.findByName(roleName);
        user.getRoles().add(role);
    }

    @Override
    public User getUser(String username) {
        return userRepo.findByUsername(username);
    }

    @Override
    public List<User> getUsers() {
        return userRepo.findAll();
    }
}
