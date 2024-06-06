package com.operaciones.logic;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaciones.entity.Operacion;
import com.operaciones.repository.OperacionRepository;
import com.operaciones.request.OperacionRequest;
import com.operaciones.service.OperacionService;

@Service
public class OperacionLogic implements OperacionService {
	@Autowired
	OperacionRepository repo;

	@Override
	public Operacion guardar(OperacionRequest request) {
		Operacion op = null;
		op = new Operacion();

		op.setId(request.getId());
		op.setResultado(request.getOperacion());

		repo.save(op);

		return op;
	}

	@Override
	public Optional<Operacion> buscar(int id) {
		return repo.findById(id);

	}
}
