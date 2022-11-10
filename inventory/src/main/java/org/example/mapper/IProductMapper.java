package org.example.mapper;

import org.example.business.dto.response.ProductResponseDto;
import org.example.data.entity.Product;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring",unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface IProductMapper {

    IProductMapper INSTANCE= Mappers.getMapper(IProductMapper.class);

    ProductResponseDto toProductResponseDto(final Product product);
    List<ProductResponseDto> tAuthListResponseDtoList(final List<Product> categories);


}
