package com.example.sercurity.service;

import com.example.sercurity.domain.Role;
import com.example.sercurity.domain.User;
import com.example.sercurity.repo.RoleRepo;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    Role saveRole(Role role);
    void addRoleToUser(String username,String roleName);
    User getUser(String username);
    List<User> getUsers();
}
