package com.walmartapi.mapper.impl;

import com.walmartapi.entity.ProductEntity;
import com.walmartapi.mapper.CustomObjectMapper;
import com.walmartapi.model.Product;

public class ProductMapper implements CustomObjectMapper<ProductEntity, Product> {
    @Override
    public ProductEntity mapToEntity(Product dto) {
        return null;
    }

    @Override
    public Product mapToDto(ProductEntity dto) {
        return null;
    }
}
