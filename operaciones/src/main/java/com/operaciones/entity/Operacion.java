package com.operaciones.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Operacion {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	private Double numero1;
	private Double numero2;
	private String operacion;
    private String contenido;
    private String resultadoCifrado;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getNumero1() {
		return numero1;
	}
	public void setNumero1(Double numero1) {
		this.numero1 = numero1;
	}
	public Double getNumero2() {
		return numero2;
	}
	public void setNumero2(Double numero2) {
		this.numero2 = numero2;
	}
	public String getOperacion() {
		return operacion;
	}
	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}
	public String getResultadoCifrado() {
		return resultadoCifrado;
	}
	public void setResultadoCifrado(String resultadoCifrado) {
		this.resultadoCifrado = resultadoCifrado;
	}
    
	
    
    
    
    

}

