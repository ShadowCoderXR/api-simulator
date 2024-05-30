package com.demo.api_simulator.repository;

import com.demo.api_simulator.model.CathEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CathRepository extends JpaRepository<CathEntity, Long> {
}
