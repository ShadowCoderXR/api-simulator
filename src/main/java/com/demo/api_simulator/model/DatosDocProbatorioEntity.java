package com.demo.api_simulator.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class DatosDocProbatorioEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String anioReg;
    private String claveEntidadRegistro;
    private String entidadRegistro;
    private String tomo;
    private String foja;
    private String numActa;
    private String libro;
    private String claveMunicipioRegistro;
    private String municipioRegistro;

    @OneToOne
    @JoinColumn(name = "cath_entity_id", unique = true)
    @JsonBackReference
    private CathEntity cathEntity;
}