package org.example.data.repository;

import org.example.data.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IProductRepository extends JpaRepository<Product,Long> {

    public Optional<List<Product>> findAllByCategoryId(Long categoryId);
    public Optional<Product> findByProductId(Long productId);
}
