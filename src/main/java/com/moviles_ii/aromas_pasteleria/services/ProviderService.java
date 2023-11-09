package com.moviles_ii.aromas_pasteleria.services;

import com.moviles_ii.aromas_pasteleria.entities.Provider;

import java.util.List;

public interface ProviderService {
    List<Provider> findAll() throws Exception;
    List<Provider> findAllActive() throws Exception;
    Provider findById(Long id) throws Exception;
    Provider save(Provider provider) throws Exception;
    Provider update(Long id, Provider provider) throws Exception;
    Provider delete(Long id) throws Exception;
}
