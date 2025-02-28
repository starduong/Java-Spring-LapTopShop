package com.example.laptopshop.reponsitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.laptopshop.domain.User;

@Repository
public interface UserReponsitory extends JpaRepository<User, Long> {
    User save(User user);

    List<User> findAll();

    User findById(long id);

    Void deleteById(long id);
}
