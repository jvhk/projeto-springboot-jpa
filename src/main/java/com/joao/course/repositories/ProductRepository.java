package com.joao.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.joao.course.entities.Category;
import com.joao.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
