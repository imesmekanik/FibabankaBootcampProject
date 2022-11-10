package org.example.presentation.mvc;

import lombok.RequiredArgsConstructor;
import org.example.business.dto.request.CreateCategoryRequestDto;
import org.example.business.dto.response.CategoryResponseDto;
import org.example.business.service.CategoryService;
import org.example.data.entity.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/inventory")
@RequiredArgsConstructor
public class CategoryController {
    private final CategoryService categoryService;

    @GetMapping("/categories")
    public ResponseEntity<List<CategoryResponseDto>> findAll(){
        return ResponseEntity.ok(categoryService.findAllDto());
    }

    @PostMapping("/category/create")
    public ResponseEntity<Void> createCategory(@RequestBody @Valid CreateCategoryRequestDto dto){
        categoryService.save(dto);
        return ResponseEntity.ok().build();
    }
}
