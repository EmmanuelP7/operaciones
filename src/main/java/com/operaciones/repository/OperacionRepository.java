package com.operaciones.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.operaciones.entity.Operacion;

public interface OperacionRepository extends JpaRepository<Operacion, Integer> {


}
