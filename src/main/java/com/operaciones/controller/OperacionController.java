package com.operaciones.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.operaciones.entity.Operacion;
import com.operaciones.logic.OperacionLogic;
import com.operaciones.request.OperacionRequest;

import jakarta.validation.Valid;

@RestController

@RequestMapping("operaciones/")
public class OperacionController {

	@Autowired
	OperacionLogic service;

	@PostMapping
	public ResponseEntity<Operacion> guardar(@Valid @RequestBody OperacionRequest request) {
		Operacion operacion = service.guardar(request);

		if (operacion != null) {
			return new ResponseEntity<>(operacion, HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@GetMapping("buscar/{id}")
	public ResponseEntity<Operacion> buscar(@PathVariable int id){
		Optional<Operacion> operacion = service.buscar(id);
		if (operacion.isPresent()) {
            return new ResponseEntity<>(operacion.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
		
	}
	
	
}
