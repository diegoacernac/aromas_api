package com.moviles_ii.aromas_pasteleria.repositories;

import com.moviles_ii.aromas_pasteleria.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
