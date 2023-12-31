package com.moviles_ii.aromas_pasteleria.services;

import com.moviles_ii.aromas_pasteleria.entities.Category;

import java.util.List;

public interface CategoryService {
    List<Category> findAll() throws Exception;
    List<Category> findByActive() throws Exception;
    Category findById(Long id) throws Exception;
    Category save(Category category) throws Exception;
    Category update(Long id, Category category) throws Exception;
    Category delete(Long id) throws Exception;
}