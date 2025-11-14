package com.example.Usuarios.model;

import java.io.Serializable;

import org.bson.codecs.pojo.annotations.BsonId;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "usuario")
public class UsuarioModel implements Serializable{
    @BsonId
    private Integer idUsuario;
    private String nombre;
    private String clave;
}
