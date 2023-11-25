package com.example.Springbootwebservices.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Springbootwebservices.entity.User;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);
}