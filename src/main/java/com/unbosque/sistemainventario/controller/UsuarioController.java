package com.unbosque.sistemainventario.controller;

import com.unbosque.sistemainventario.model.Usuario;
import com.unbosque.sistemainventario.service.serviceApi.UsuarioService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping({"/usuario"})
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping("/nuevo")
    public ResponseEntity<Usuario> saveProducto(@RequestBody Usuario usuario) {
        Usuario user = usuarioService.insertUsuario(usuario);
        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    
}
