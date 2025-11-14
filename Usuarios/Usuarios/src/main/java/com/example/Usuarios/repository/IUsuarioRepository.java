package com.example.Usuarios.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.Usuarios.model.UsuarioModel;

public interface IUsuarioRepository extends MongoRepository<UsuarioModel, Integer> {
    UsuarioModel findByNombre(String nombre);
}
