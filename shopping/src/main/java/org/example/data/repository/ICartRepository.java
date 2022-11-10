package org.example.data.repository;

import org.example.data.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ICartRepository extends JpaRepository<Cart,Long> {
    public Optional<Cart> findByCartId(Long cartId);
}
