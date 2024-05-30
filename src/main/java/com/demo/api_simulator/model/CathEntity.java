package com.demo.api_simulator.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class CathEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String estatus;
    private String codigoValidacion;
    private String curp;
    private String nombre;
    private String apellidoPaterno;
    private String apellidoMaterno;
    private String sexo;
    private String fechaNacimiento;
    private String paisNacimiento;
    private String estadoNacimiento;
    private int docProbatorio;
    private String estatusCurp;
    private String estatusCurpDesc;
    private String documento;
    private String claveMensaje;

    @OneToOne(mappedBy = "cathEntity", cascade = CascadeType.ALL)
    @JsonManagedReference
    private DatosDocProbatorioEntity datosDocProbatorio;
}