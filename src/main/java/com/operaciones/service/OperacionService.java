package com.operaciones.service;

import java.util.Optional;

import com.operaciones.entity.Operacion;
import com.operaciones.request.OperacionRequest;

public interface OperacionService {
	
	Operacion guardar(OperacionRequest request);
	Optional<Operacion> buscar(int id);

}
