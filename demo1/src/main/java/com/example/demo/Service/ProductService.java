package com.example.demo.Service;

import com.example.demo.Model.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getAllProducts();
    public Product getProductById(Long id);
    public Product addProduct(Product product);
    public void deleteProduct(Long id);
    public Product updateProduct(Long id, Product product);
}
