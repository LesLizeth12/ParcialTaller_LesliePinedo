package com.example.Usuarios.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Usuarios.model.UsuarioModel;
import com.example.Usuarios.repository.IUsuarioRepository;


@Service
public class UsuarioService implements IUsuarioService{
    @Autowired
    IUsuarioRepository usuarioRepository;

    @Override
    public UsuarioModel findByNombre(String nombre) {
       return usuarioRepository.findByNombre(nombre);
    }
    
}
