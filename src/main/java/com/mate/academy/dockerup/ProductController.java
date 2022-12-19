package com.mate.academy.dockerup;

import com.mate.academy.dockerup.mapper.ProductMapper;
import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/products")
public class ProductController {
    private final ProductService productService;
    private final ProductMapper productMapper;

    public ProductController(ProductService productService, ProductMapper productMapper) {
        this.productService = productService;
        this.productMapper = productMapper;
    }

    @PostMapping
    public ProductResponseDto create(@RequestBody ProductRequestDto productRequestDto){
        Product product = productService.save(productMapper.fromDto(productRequestDto));
        return productMapper.toDto(product);
    }

    @GetMapping("/all")
    public List<ProductResponseDto> getAll() {
        return productService.findAll()
                .stream()
                .map(productMapper::toDto)
                .collect(Collectors.toList());
    }

    @GetMapping("/price")
    public List<ProductResponseDto> findAllByPriceIsBetween(@RequestParam BigDecimal from,
                                                            @RequestParam BigDecimal to){
        return productService.findAllByPriceIsBetween(from, to)
                .stream()
                .map(productMapper::toDto)
                .collect(Collectors.toList());
    }
}
