package com.example.springweb.Service;

import com.example.springweb.dto.ProductDto;

import java.util.List;

public interface IProductService {
    List<ProductDto>findAll();
    List<ProductDto>findAllByCategoryId(Long id);
    ProductDto findProductById(Long id);
    List<ProductDto>topThree();
}
