package org.example.business.service;

import org.example.business.dto.request.CreateCartProductRequestDto;
import org.example.data.entity.CartProduct;
import org.example.data.repository.ICartProductRepository;
import org.example.data.repository.ICartRepository;
import org.example.manager.IProductManager;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CartProductService extends ServiceManager<CartProduct,Long> {

    private final ICartProductRepository cartProductRepository;
    private final IProductManager productManager;
    private final ICartRepository cartRepository;
    public CartProductService(ICartProductRepository cartProductRepository,ICartRepository cartRepository,IProductManager productManager) {
        super(cartProductRepository);
        this.cartProductRepository=cartProductRepository;
        this.cartRepository=cartRepository;
        this.productManager=productManager;
    }

    public String save(CreateCartProductRequestDto dto){
        //Boyle bir cart id li cart varsa yeni cartProduct olustursun
        if(cartRepository.findById(dto.getCartId()).isPresent()){
            if(productManager.findByIdToCardProduct(dto.getProductId())!=null) {

                CartProduct cartProduct= CartProduct.builder().cartId(dto.getCartId()).productId(dto.getProductId()).salesQuantity(dto.getSalesQuantity())
                        .salesPrice(productManager.findByIdToCardProduct(dto.getProductId()).getBody().getSalesPrice()).lineAmount(dto.getLineAmount()).build();
                save(cartProduct);
                return "CardProduct Added: "+ cartProduct.getCartProductId();
            }
            else {
                //ERROR EKLENECEKGlobalExceptionHandler
                return "Product doesnt exist";
            }
        }
        else {
            //ERROR EKLENECEK
            return "Category Id Doesnt Exist";
        }

    }

    public Optional<CartProduct> findByCartIdAndProductId(Long cartId,Long productId){
        return cartProductRepository.findByCartIdAndProductId(cartId,productId);
    }



}
