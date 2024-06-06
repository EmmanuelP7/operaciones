package com.operaciones.service;

import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.operaciones.entity.Operacion;
import com.operaciones.repository.OperacionRepository;
import com.operaciones.request.OperacionRequest;

@Service
public class OperacionService {

	@Autowired
    private OperacionRepository operacionRepository;
	
	public String realizarOperacion(OperacionRequest request) {
		
		double resultado = 0;
		
		
		switch (request.getOperacion().toLowerCase()) {
        case "suma":
            resultado = request.getNumero1() + request.getNumero2();
            break;
        case "resta":
            resultado = request.getNumero1() - request.getNumero2();
            break;
        case "multiplicacion":
            resultado = request.getNumero1() * request.getNumero2();
            break;
        case "division":
            resultado = request.getNumero1() / request.getNumero2();
            break;
       
		default:
			
			break;
		}
		
		Operacion operacion = new Operacion();
		operacion.setContenido(request.toString());
		
		
		return String.valueOf(resultado);
		
	}
	
	

  
}
	
