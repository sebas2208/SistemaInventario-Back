package com.unbosque.sistemainventario.repository;

import com.unbosque.sistemainventario.model.Usuario;

import org.springframework.data.repository.CrudRepository;

public interface UsuarioRepository extends CrudRepository <Usuario, Long> {
    
}
