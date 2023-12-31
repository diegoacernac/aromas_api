package com.moviles_ii.aromas_pasteleria.services;

import com.moviles_ii.aromas_pasteleria.entities.ProductInventory;

import java.util.List;

public interface ProductInventoryService {
    List<ProductInventory> findAll() throws Exception;
    List<ProductInventory> findAllActive() throws Exception;
    ProductInventory findById(Long id) throws Exception;
    ProductInventory save(ProductInventory productInventory) throws Exception;
    ProductInventory update(Long id, ProductInventory productInventory) throws Exception;
    ProductInventory delete(Long id) throws Exception;
}
