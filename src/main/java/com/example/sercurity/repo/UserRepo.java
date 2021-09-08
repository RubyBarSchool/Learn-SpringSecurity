package com.example.sercurity.repo;

import com.example.sercurity.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepo  extends JpaRepository<User,Long> {
    User findByUsername(String username);
}
