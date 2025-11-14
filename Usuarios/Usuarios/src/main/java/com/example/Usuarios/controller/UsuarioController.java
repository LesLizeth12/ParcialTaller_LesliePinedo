package com.example.Usuarios.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.Usuarios.constant.UrlConstans;
import com.example.Usuarios.model.UsuarioModel;
import com.example.Usuarios.service.IUsuarioService;

@RestController
@RequestMapping(UrlConstans.USUARIO_BASE)
public class UsuarioController {
    @Autowired
    IUsuarioService usuarioService;

    @GetMapping(UrlConstans.USUARIO_LOGIN)
    public UsuarioModel login(@RequestParam String nombre) {
        return usuarioService.findByNombre(nombre);
    }

}
