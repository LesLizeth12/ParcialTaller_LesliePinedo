package com.example.Operacion.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Operacion.constant.UrlConstants;
import com.example.Operacion.model.OperacionModel;
import com.example.Operacion.service.OperacionService;

@RestController
@RequestMapping(UrlConstants.OPERACION_BASE)
public class OperacionController {
    private static final Logger logger = LoggerFactory.getLogger(OperacionController.class);

    @Autowired
    OperacionService service;

    @PostMapping(UrlConstants.OPERACION_CREATE)
    public ResponseEntity<?> create(@RequestBody OperacionModel model){
        OperacionModel nuevoOperacion = service.registrar(model);
        logger.info("Operacion creado exitosamente con ID: {}", nuevoOperacion.getIdOperacion());
        return new ResponseEntity<>(nuevoOperacion, HttpStatus.CREATED);
    }

}
