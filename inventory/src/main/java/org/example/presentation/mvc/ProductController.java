package org.example.presentation.mvc;

import lombok.RequiredArgsConstructor;
import org.example.business.dto.request.CreateProductRequestDto;
import org.example.business.dto.response.CartProductResponseDto;
import org.example.business.dto.response.ProductResponseDto;
import org.example.business.service.ProductService;
import org.example.data.entity.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/inventory")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;
    @GetMapping("/products/{categoryId}")
    public ResponseEntity<List<ProductResponseDto>> findAllByCategoryId(@PathVariable("categoryId")Long categoryId){

        return ResponseEntity.ok(productService.findAllByCategoryId(categoryId));
    }

    @GetMapping("product/{id}")
    public ResponseEntity<ProductResponseDto> findByProductId(@PathVariable("id")Long productId){
        return  ResponseEntity.ok(productService.findByIdDto(productId));
    }

    @PostMapping("/product/create")
    public ResponseEntity<Void> createProduct(@RequestBody @Valid CreateProductRequestDto dto){
        productService.save(dto);
        return ResponseEntity.ok().build();
    }



    @GetMapping("/findsalespricebyid/{id}")
    public ResponseEntity<CartProductResponseDto> findByIdToCardProduct(@PathVariable Long id){
        return ResponseEntity.ok(productService.findByIdToCardProduct(id));
    }
}
