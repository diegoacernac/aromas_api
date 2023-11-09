package com.moviles_ii.aromas_pasteleria.repositories;

import com.moviles_ii.aromas_pasteleria.entities.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderRepository extends JpaRepository<Provider, Long> {
}
