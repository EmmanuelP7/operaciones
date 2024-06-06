package com.operaciones.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.operaciones.entity.Operacion;
import com.operaciones.request.OperacionRequest;
import com.operaciones.service.OperacionService;

@RestController
@RequestMapping("operaciones/")
public class OperacionController {

	@Autowired
    private OperacionService operacionService;
	
	 
	    public ResponseEntity<String> calcular(@RequestBody OperacionRequest request) {
	        String resultado = operacionService.realizarOperacion(request);
	        return new ResponseEntity<String>(resultado, HttpStatus.OK);
	    }
}
