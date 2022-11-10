package org.example.mvc;

import lombok.RequiredArgsConstructor;
import org.example.business.dto.request.CreateCartProductRequestDto;
import org.example.business.dto.request.CreateCartRequestDto;
import org.example.business.service.CartProductService;
import org.example.business.service.CartService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/shopping")
@RequiredArgsConstructor
public class CartProductController {

    private final CartProductService cartProductService;


    @PostMapping("/cart/add")
    public ResponseEntity<Void> addProduct(@RequestBody @Valid CreateCartProductRequestDto dto){
        cartProductService.save(dto);
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/cart/{cartId}/remove/{productId}")
    public ResponseEntity<Void> deleteCartProduct(@PathVariable("cartId")Long cartId,@PathVariable("productId")Long productId){
        cartProductService.delete(cartProductService.findByCartIdAndProductId(cartId,productId).get());
        return ResponseEntity.ok().build();
    }

}
