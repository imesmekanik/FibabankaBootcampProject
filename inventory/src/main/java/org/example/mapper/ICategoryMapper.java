package org.example.mapper;


import org.example.business.dto.response.CategoryResponseDto;
import org.example.data.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface ICategoryMapper {

    ICategoryMapper INSTANCE= Mappers.getMapper(ICategoryMapper.class);


    List<CategoryResponseDto> tAuthListResponseDtoList(final List<Category> categories);


}
