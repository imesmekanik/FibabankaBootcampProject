package org.example.data.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Table(name = "tbl_cart")
@Entity
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cartId;
    private String customerName;
    private Double totalAmount;
    @Enumerated(value = EnumType.STRING)
    @Builder.Default
    private CartStatus cartStatus=CartStatus.YENI;
}
