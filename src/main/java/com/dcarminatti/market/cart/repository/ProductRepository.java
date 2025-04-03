package com.dcarminatti.market.cart.repository;

import com.dcarminatti.market.cart.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findByCategoryName(String category);
    List<Product> findByBrand(String brand);
    List<Product> findByName(String name);
    List<Product> findByCategoryNameAndBrand(String category, String brand);
    List<Product> findByCategoryNameAndName(String categoryName, String name);
    List<Product> findByBrandAndName(String brand, String name);
    Long countProductByBrandAndName(String brand, String name);
}
