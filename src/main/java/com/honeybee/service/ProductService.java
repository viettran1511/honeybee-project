package com.honeybee.service;

import com.honeybee.dto.ProductDTO;
import com.honeybee.model.Product;
import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    Product addProduct(ProductDTO product);
    Product updateProduct(Long id, Product updatedProduct);
    void deleteProduct(Long id);
}

