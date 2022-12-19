package com.mate.academy.dockerup;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class ProductRequestDto {
    private String title;
    private BigDecimal price;
}
