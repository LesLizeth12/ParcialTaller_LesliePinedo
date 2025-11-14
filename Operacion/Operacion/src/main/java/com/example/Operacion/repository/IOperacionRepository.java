package com.example.Operacion.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Operacion.model.OperacionModel;

@Repository
public interface IOperacionRepository extends CrudRepository <OperacionModel,Integer>{
    
}
