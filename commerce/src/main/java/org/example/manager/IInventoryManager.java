package org.example.manager;


import org.example.business.dto.response.CategoryResponseDto;
import org.example.business.dto.response.ProductResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import java.util.List;


@FeignClient(name="inventory",url = "http://localhost:8081/inventory",decode404 = true)
public interface IInventoryManager {

    @GetMapping("/categories")
    public ResponseEntity<List<CategoryResponseDto>> findAll();

    @GetMapping("/products/{categoryId}")
    public ResponseEntity<List<ProductResponseDto>> findAllByCategoryId(@PathVariable("categoryId")Long categoryId);

    @GetMapping("product/{id}")
    public ResponseEntity<ProductResponseDto> findByProductId(@PathVariable("id")Long productId);


}
