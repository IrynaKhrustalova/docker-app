package com.mate.academy.dockerup;

import java.math.BigDecimal;
import java.util.List;

public interface ProductService {
    Product save(Product product);

    List<Product> findAll();

    List<Product> findAllByPriceIsBetween(BigDecimal from, BigDecimal to);
}
