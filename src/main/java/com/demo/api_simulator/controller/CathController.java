package com.demo.api_simulator.controller;

import com.demo.api_simulator.repository.CathRepository;
import com.demo.api_simulator.model.CathEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class CathController {

    @Autowired
    private CathRepository cathRepository;

    @PostMapping("/gov/curp")
    public ResponseEntity<CathEntity> createCathEntity(@RequestBody CathEntity cathEntity) {
        if (cathEntity.getDatosDocProbatorio() != null) {
            cathEntity.getDatosDocProbatorio().setCathEntity(cathEntity);
        }
        CathEntity savedCathEntity = cathRepository.save(cathEntity);
        return ResponseEntity.ok(savedCathEntity);
    }
}
