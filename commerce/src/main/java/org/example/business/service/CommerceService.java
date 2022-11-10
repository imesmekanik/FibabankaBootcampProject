package org.example.business.service;

import lombok.RequiredArgsConstructor;
import org.example.business.dto.request.CreateCartProductRequestDto;
import org.example.business.dto.request.CreateCartRequestDto;
import org.example.business.dto.response.CategoryResponseDto;
import org.example.business.dto.response.ProductResponseDto;
import org.example.manager.IInventoryManager;
import org.example.manager.IShoppingManager;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CommerceService {

    private final IInventoryManager iInventoryManager;
    private final IShoppingManager shoppingManager;


    public ResponseEntity<List<CategoryResponseDto>> findAll(){
        return iInventoryManager.findAll();
    }

    public ResponseEntity<List<ProductResponseDto>> findAllByCategoryId(@PathVariable("categoryId")Long categoryId){
        return iInventoryManager.findAllByCategoryId(categoryId);
    }

    public ResponseEntity<ProductResponseDto> findByProductId(@PathVariable("id")Long productId){
        return iInventoryManager.findByProductId(productId);
    }

    public ResponseEntity<Void> createCart(@RequestBody @Valid CreateCartRequestDto dto){
        return shoppingManager.createCart(dto);
    }

    public ResponseEntity<Void> checkout(@PathVariable("cartId")Long cartId){
        return shoppingManager.checkout(cartId);
    }

    public ResponseEntity<Void> addProduct(@RequestBody @Valid CreateCartProductRequestDto dto){
        return shoppingManager.addProduct(dto);
    }

    public ResponseEntity<Void> deleteCartProduct(@PathVariable("cartId")Long cartId,@PathVariable("productId")Long productId){
        return shoppingManager.deleteCartProduct(cartId,productId);
    }
}
