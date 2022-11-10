package org.example.manager;

import org.example.business.dto.request.CreateCartProductRequestDto;
import org.example.business.dto.request.CreateCartRequestDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;


@FeignClient(name="shopping",url = "http://localhost:8082/shopping",decode404 = true)
public interface IShoppingManager {

    @PostMapping("/cart/create")
    public ResponseEntity<Void> createCart(@RequestBody @Valid CreateCartRequestDto dto);

    @GetMapping("/checkout/{cartId}")
    public ResponseEntity<Void> checkout(@PathVariable("cartId")Long cartId);

    @PostMapping("/cart/add")
    public ResponseEntity<Void> addProduct(@RequestBody @Valid CreateCartProductRequestDto dto);

    @DeleteMapping("/cart/{cartId}/remove/{productId}")
    public ResponseEntity<Void> deleteCartProduct(@PathVariable("cartId")Long cartId,@PathVariable("productId")Long productId);

}