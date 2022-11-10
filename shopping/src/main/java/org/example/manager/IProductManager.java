package org.example.manager;


import org.example.business.dto.response.CartProductResponseDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;




@FeignClient(name="inventory",url = "http://localhost:8081/inventory",decode404 = true)
public interface IProductManager {

    @GetMapping("/findsalespricebyid/{id}")
    public ResponseEntity<CartProductResponseDto> findByIdToCardProduct(@PathVariable Long id);
}
