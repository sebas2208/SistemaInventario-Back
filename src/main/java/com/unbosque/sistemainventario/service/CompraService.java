package com.unbosque.sistemainventario.service;

import java.util.Optional;

import com.unbosque.sistemainventario.model.Compra;
import com.unbosque.sistemainventario.repository.CompraRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CompraService implements CompraRepository{
    
    @Autowired
    private CompraRepository compraRepository;

    public CompraRepository getCompraRepository() {
        return compraRepository;
    }

    public void setCompraRepository(CompraRepository compraRepository) {
        this.compraRepository = compraRepository;
    }

    @Override
    public <S extends Compra> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public <S extends Compra> Iterable<S> saveAll(Iterable<S> entities) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Optional<Compra> findById(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean existsById(Long id) {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public Iterable<Compra> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public Iterable<Compra> findAllById(Iterable<Long> ids) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public long count() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public void deleteById(Long id) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void delete(Compra entity) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAllById(Iterable<? extends Long> ids) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAll(Iterable<? extends Compra> entities) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void deleteAll() {
        // TODO Auto-generated method stub
        
    }
}
