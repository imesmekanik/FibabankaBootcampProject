package org.example.presentation.mvc;
import lombok.RequiredArgsConstructor;
import org.example.business.dto.request.CreateCartProductRequestDto;
import org.example.business.dto.request.CreateCartRequestDto;
import org.example.business.dto.response.CategoryResponseDto;
import org.example.business.dto.response.ProductResponseDto;
import org.example.business.service.CommerceService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/commerce")
@RequiredArgsConstructor
public class CommerceController {

    private final CommerceService commerceService;

    @GetMapping("/inventory/categories")
    public ResponseEntity<List<CategoryResponseDto>> findAll(){
        return commerceService.findAll();
    }

    @GetMapping("/inventory/products/{categoryId}")
    public ResponseEntity<List<ProductResponseDto>> findAllByCategoryId(@PathVariable("categoryId")Long categoryId){
        return commerceService.findAllByCategoryId(categoryId);
    }
    @GetMapping("/inventory/product/{id}")
    public ResponseEntity<ProductResponseDto> findByProductId(@PathVariable("id")Long productId){
        return commerceService.findByProductId(productId);
    }
    @GetMapping("/shopping/cart/create")
    public ResponseEntity<Void> createCart(@RequestBody @Valid CreateCartRequestDto dto){
        return commerceService.createCart(dto);
    }
    @GetMapping("shopping/checkout/{cartId}")
    public ResponseEntity<Void> checkout(@PathVariable("cartId")Long cartId){
        return commerceService.checkout(cartId);
    }
    @PostMapping("shopping/cart/add")
    public ResponseEntity<Void> addProduct(@RequestBody @Valid CreateCartProductRequestDto dto){
        return commerceService.addProduct(dto);
    }
    @DeleteMapping("shopping/cart/{cartId}/remove/{productId}")
    public ResponseEntity<Void> deleteCartProduct(@PathVariable("cartId")Long cartId,@PathVariable("productId")Long productId){
        return commerceService.deleteCartProduct(cartId,productId);
    }
}