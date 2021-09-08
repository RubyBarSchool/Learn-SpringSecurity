package com.example.sercurity.repo;

import com.example.sercurity.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface RoleRepo extends JpaRepository<Role,Long> {
    Role findByName(String name);
}
