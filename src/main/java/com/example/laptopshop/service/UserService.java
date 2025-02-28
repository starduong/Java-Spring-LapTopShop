package com.example.laptopshop.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.laptopshop.domain.Role;
import com.example.laptopshop.domain.User;
import com.example.laptopshop.reponsitory.RoleReponsitory;
import com.example.laptopshop.reponsitory.UserReponsitory;

@Service
public class UserService {

    private final UserReponsitory userReponsitory;
    private final RoleReponsitory roleReponsitory;

    public UserService(UserReponsitory userReponsitory, RoleReponsitory roleReponsitory) {
        this.userReponsitory = userReponsitory;
        this.roleReponsitory = roleReponsitory;
    }

    public List<User> handleGetAllUsers() {
        return this.userReponsitory.findAll();
    }

    public User handleGetUserById(long id) {
        return this.userReponsitory.findById(id);
    }

    public User handleSaveUser(User user) {
        return this.userReponsitory.save(user);
    }

    public void handleDeleteUserById(long id) {
        this.userReponsitory.deleteById(id);
    }

    public Role getRoleByName(String name) {
        return this.roleReponsitory.findByName(name);
    }
}
