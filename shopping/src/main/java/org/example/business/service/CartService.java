package org.example.business.service;

import org.example.business.dto.request.CreateCartRequestDto;
import org.example.data.entity.Cart;
import org.example.data.entity.CartStatus;
import org.example.data.repository.ICartRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public class CartService extends ServiceManager<Cart,Long> {
    private final ICartRepository cartRepository;
    public CartService(ICartRepository cartRepository) {
        super(cartRepository);
        this.cartRepository=cartRepository;
    }

    public String save(CreateCartRequestDto dto){
        Cart cart= Cart.builder().customerName(dto.getCustomerName()).totalAmount(dto.getTotalAmount()).build();
        save(cart);
        return "Category Saved: "+ cart.getCartId();
    }

    public String checkout(Long cartId){
        cartRepository.findByCartId(cartId).get().setCartStatus(CartStatus.BITMIS);
        return "Checkout completed";
    }
}
