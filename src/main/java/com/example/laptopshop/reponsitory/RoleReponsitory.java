package com.example.laptopshop.reponsitory;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.laptopshop.domain.Role;

@Repository
public interface RoleReponsitory extends JpaRepository<Role, Long> {
    Role findByName(String name);
}
