package com.example.appproductmanager.service;

import com.example.appproductmanager.model.Product;

import java.util.*;

public class ProductServiceImplant implements ProductService {
    private static Map<Integer, Product> products;
    static {
        products = new HashMap<Integer, Product>();
        products.put(1,new Product(1,"Iphone 6s","San pham tuyet voi",1200,"Iphone"));
        products.put(2,new Product(2,"Iphone 6","San pham qua te",400,"Iphone"));
        products.put(3,new Product(3,"Iphone 12","San pham tuyet voi",6700,"Iphone"));
        products.put(4,new Product(4,"Samsung S22","San pham tuyet voi cua VN",12600,"Samsung"));
        products.put(5,new Product(5,"Xiami","Qua te",200,"Xiaomi"));
    }

    @Override
    public List<Product> findAllProducts() {
        return new ArrayList<>(products.values());
    }

    @Override
    public void saveProduct(Product product) {
        products.put(product.getId(),product);
    }

    @Override
    public void removeProduct(int id) {
        products.remove(id);
    }

    @Override
    public void updateProduct(int id, Product product) {
        products.put(id,product);
    }

    @Override
    public Product findById(int id) {
        return products.get(id);
    }
}
