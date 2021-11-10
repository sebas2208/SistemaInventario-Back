package com.unbosque.sistemainventario.repository;

import com.unbosque.sistemainventario.model.Venta;

import org.springframework.data.repository.CrudRepository;

public interface VentaRepository extends CrudRepository<Venta, Long> {
    
}
