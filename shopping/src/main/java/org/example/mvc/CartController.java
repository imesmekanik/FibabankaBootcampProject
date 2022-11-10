package org.example.mvc;

import lombok.RequiredArgsConstructor;
import org.example.business.dto.request.CreateCartRequestDto;
import org.example.business.service.CartService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/shopping")
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;
    @PostMapping("/cart/create")
    public ResponseEntity<Void> createCart(@RequestBody @Valid CreateCartRequestDto dto){
        cartService.save(dto);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/checkout/{cartId}")
    public ResponseEntity<Void> checkout(@PathVariable("cartId")Long cartId){
        cartService.checkout(cartId);
        return ResponseEntity.ok().build();
    }

}
