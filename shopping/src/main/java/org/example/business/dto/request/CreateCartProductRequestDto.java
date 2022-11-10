package org.example.business.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CreateCartProductRequestDto {

    private Long cartId;

    private Long productId;

    private Integer salesQuantity;
    //private Double salesPrice;
    private Double lineAmount;
}
