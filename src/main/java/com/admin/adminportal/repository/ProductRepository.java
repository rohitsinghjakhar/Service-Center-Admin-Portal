package com.admin.adminportal.repository;

import com.admin.adminportal.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
