package com.walmartapi.service;

import com.walmartapi.entity.ProductEntity;
import com.walmartapi.model.Product;
import com.walmartapi.repository.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    public Product saveProduct(Product product) {

        // Product -> Entity
        ProductEntity productEntity = new ProductEntity();
        productEntity.setDescription(product.getDescription());
        productEntity.setPrice(product.getPrice());
        productEntity.setName(product.getName());

        ProductEntity savedEntity = productRepository.save(productEntity);

        Product savedProduct = new Product();

        // Entity ->
        savedProduct.setName(savedEntity.getName());
        savedProduct.setDescription(savedEntity.getDescription());
        savedProduct.setPrice(savedEntity.getPrice());
        savedProduct.setId(savedEntity.getId());

        // map POJO to entity
        // Call DB
        // map entity to POJO

        return product;
    }

}
