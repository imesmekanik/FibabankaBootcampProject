package org.example.business.service;

import org.example.business.dto.request.CreateCategoryRequestDto;
import org.example.business.dto.response.CategoryResponseDto;
import org.example.data.entity.Category;
import org.example.data.repository.ICategoryRepository;
import org.example.mapper.ICategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService extends ServiceManager<Category,Long>{

    private final ICategoryRepository repository;

    public CategoryService(ICategoryRepository repository) {
        super(repository);
        this.repository=repository;
    }

    public String save(CreateCategoryRequestDto dto){
        Category category= Category.builder().categoryName(dto.getCategoryName()).build();
        save(category);
        return "Category Saved: "+ category.getCategoryId();
    }

    public List<CategoryResponseDto> findAllDto() {
        return ICategoryMapper.INSTANCE.tAuthListResponseDtoList(repository.findAll());
    }

}
