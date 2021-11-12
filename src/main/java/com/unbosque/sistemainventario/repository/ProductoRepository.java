package com.unbosque.sistemainventario.repository;


import com.unbosque.sistemainventario.model.Producto;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductoRepository extends CrudRepository<Producto, Long> {

}
