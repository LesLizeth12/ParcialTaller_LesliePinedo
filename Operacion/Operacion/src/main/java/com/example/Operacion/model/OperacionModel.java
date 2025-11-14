package com.example.Operacion.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table( name = "operacion")
public class OperacionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idOperacion")
    public Integer idOperacion;

    @Column(name = "idCliente")
    public Integer idCliente;
    @Column(name = "tipoOperacion")
    public String tipoOperacion;
    @Column(name = "total")
    public Integer total;
}
