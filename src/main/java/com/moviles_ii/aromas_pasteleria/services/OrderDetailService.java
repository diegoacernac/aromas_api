package com.moviles_ii.aromas_pasteleria.services;

import com.moviles_ii.aromas_pasteleria.entities.OrderDetail;

import java.util.List;

public interface OrderDetailService {
    List<OrderDetail> findAll() throws Exception;
    OrderDetail findById(Long id) throws Exception;
    OrderDetail save(OrderDetail orderDetail) throws Exception;
    OrderDetail update(Long id, OrderDetail orderDetail) throws Exception;
}
