package com.moviles_ii.aromas_pasteleria.repositories;

import com.moviles_ii.aromas_pasteleria.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
