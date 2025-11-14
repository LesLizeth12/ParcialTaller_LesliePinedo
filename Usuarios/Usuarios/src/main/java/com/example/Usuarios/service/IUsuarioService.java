package com.example.Usuarios.service;

import com.example.Usuarios.model.UsuarioModel;

public interface IUsuarioService {
    public UsuarioModel findByNombre(String nombre);
}
