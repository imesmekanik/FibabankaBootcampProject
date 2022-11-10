package org.example.data.repository;

import org.example.data.entity.CartProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICartProductRepository extends JpaRepository<CartProduct,Long> {

    public Optional<CartProduct> findByCartIdAndProductId(Long cartId, Long productId);
}
