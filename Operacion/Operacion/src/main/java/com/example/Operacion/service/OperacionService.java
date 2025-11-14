package com.example.Operacion.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Operacion.model.OperacionModel;
import com.example.Operacion.repository.IOperacionRepository;

@Service
public class OperacionService implements IOperacionService {
    @Autowired
    IOperacionRepository repository;

    @Override
    public OperacionModel registrar(OperacionModel model) {
        return repository.save(model);
    }

}