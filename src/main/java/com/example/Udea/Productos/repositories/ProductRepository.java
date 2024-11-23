package com.example.Udea.Productos.repositories;

import com.example.Udea.Productos.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}
