package com.example.demoSQL_NoSQL.Repository;

import com.example.demoSQL_NoSQL.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
