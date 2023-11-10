package com.moviles_ii.aromas_pasteleria.services;

import com.moviles_ii.aromas_pasteleria.entities.Product;

import java.util.List;

public interface ProductService {
    List<Product> findAll() throws Exception;
    List<Product> findAllActive() throws Exception;
    Product findById(Long id) throws Exception;
    Product save(Product product) throws Exception;
    Product update(Long id, Product product) throws Exception;
    Product delete(Long id) throws Exception;
}
