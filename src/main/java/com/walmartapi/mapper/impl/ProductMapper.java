package com.walmartapi.mapper.impl;

import com.walmartapi.entity.ProductEntity;
import com.walmartapi.mapper.CustomObjectMapper;
import com.walmartapi.model.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductMapper implements CustomObjectMapper<ProductEntity, Product> {
    @Override
    public ProductEntity mapToEntity(Product dto) {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setDescription(dto.getDescription());
        productEntity.setPrice(dto.getPrice());
        productEntity.setName(dto.getName());
        return productEntity;
    }

    @Override
    public Product mapToDto(ProductEntity dto) {
        Product savedProduct = new Product();
        savedProduct.setName(dto.getName());
        savedProduct.setDescription(dto.getDescription());
        savedProduct.setPrice(dto.getPrice());
        savedProduct.setId(dto.getId());
        return savedProduct;
    }
}
