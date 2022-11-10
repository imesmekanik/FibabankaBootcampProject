package org.example.business.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class CreateProductRequestDto {

    private String productName;
    private Double salesPrice;
    private Long categoryId;
}
