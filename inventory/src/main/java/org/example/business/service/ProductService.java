package org.example.business.service;

import org.example.business.dto.request.CreateProductRequestDto;
import org.example.business.dto.response.CartProductResponseDto;
import org.example.business.dto.response.ProductResponseDto;
import org.example.data.entity.Product;
import org.example.data.repository.ICategoryRepository;
import org.example.data.repository.IProductRepository;
import org.example.mapper.ICategoryMapper;
import org.example.mapper.IProductMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService extends ServiceManager<Product,Long>{

    private final ICategoryRepository categoryRepository;
    private final IProductRepository productRepository;
    public ProductService(IProductRepository productRepository, ICategoryRepository categoryRepository) {
        super(productRepository);
        this.productRepository=productRepository;
        this.categoryRepository=categoryRepository;
    }

    public List<ProductResponseDto> findAllByCategoryId(Long categoryId) {
        return IProductMapper.INSTANCE.tAuthListResponseDtoList(productRepository.findAllByCategoryId(categoryId).get());

    }

    public String save(CreateProductRequestDto dto){
        //Boyle bir category id li category varsa yeni urun olustursun
        if(categoryRepository.findById(dto.getCategoryId()).isPresent()){
            Product product=Product.builder().productName(dto.getProductName()).salesPrice(dto.getSalesPrice()).categoryId(dto.getCategoryId()).build();
            save(product);
            return "Product Saved: "+ product.getProductId();
        }
        else {
            //ERROR EKLENECEK
            return "Category Id Doesnt Exist";
        }

    }

    public ProductResponseDto findByIdDto(Long productId){
        return IProductMapper.INSTANCE.toProductResponseDto(productRepository.findByProductId(productId).get());

    }

    public CartProductResponseDto findByIdToCardProduct(Long productId){
        Product product=productRepository.findByProductId(productId).get();
        CartProductResponseDto cartProductDto= CartProductResponseDto.builder().productId(product.getProductId()).salesPrice(product.getSalesPrice()).build();
        return cartProductDto;
    }
}
