package com.unbosque.sistemainventario.service.serviceImpl;

import com.unbosque.sistemainventario.service.serviceApi.UsuarioService;

import com.unbosque.sistemainventario.model.Usuario;
import com.unbosque.sistemainventario.repository.UsuarioRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional

public class UsuarioServiceImpl implements UsuarioService{

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public Usuario insertUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
     
}
