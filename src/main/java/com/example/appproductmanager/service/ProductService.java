package com.example.appproductmanager.service;

import com.example.appproductmanager.model.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAllProducts();

    void saveProduct(Product product);

    void removeProduct(int id);

    void updateProduct(int id, Product product);

    Product findById(int id);

}
