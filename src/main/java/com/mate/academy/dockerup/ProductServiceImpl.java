package com.mate.academy.dockerup;

import org.springframework.stereotype.Service;
import java.math.BigDecimal;
import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private final ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }

    @Override
    public List<Product> findAll() {

        return productRepository.findAll();
    }

    @Override
    public List<Product> findAllByPriceIsBetween(BigDecimal from, BigDecimal to) {
        return productRepository.findAllByPriceIsBetween(from, to);
    }
}
