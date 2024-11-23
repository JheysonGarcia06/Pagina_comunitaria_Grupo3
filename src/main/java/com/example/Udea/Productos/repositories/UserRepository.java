package com.example.Udea.Productos.repositories;

import com.example.Udea.Productos.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
