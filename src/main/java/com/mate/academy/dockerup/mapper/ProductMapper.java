package com.mate.academy.dockerup.mapper;

import com.mate.academy.dockerup.Product;
import com.mate.academy.dockerup.ProductRequestDto;
import com.mate.academy.dockerup.ProductResponseDto;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper {
    public ProductResponseDto toDto(Product product) {
        ProductResponseDto productResponseDto = new ProductResponseDto();
        productResponseDto.setTitle(product.getTitle());
        productResponseDto.setPrice(product.getPrice());
        productResponseDto.setId(product.getId());
        return productResponseDto;
    }

    public Product fromDto(ProductRequestDto productRequestDto) {
        Product product = new Product();
        product.setTitle(productRequestDto.getTitle());
        product.setPrice(productRequestDto.getPrice());
        return product;
    }
}
