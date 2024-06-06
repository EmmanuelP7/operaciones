package com.operaciones.request;

import jakarta.validation.constraints.NotBlank;

public class OperacionRequest {

	@NotBlank(message = "El id no puede estar vacio")
	private Long id;
	@NotBlank(message = "No puede estar en vacio")
	private Double numero1;
	@NotBlank(message = "No puede estar en vacio")
	private Double numero2;
	@NotBlank(message = "Neceseitas una operacion valida")
	private String operacion;
	private String contenido;
	
	private String resultadoCifrado;

	public OperacionRequest() {
	}

	public OperacionRequest(@NotBlank(message = "El id no puede estar vacio") Long id,
			@NotBlank(message = "No puede estar en vacio") Double numero1,
			@NotBlank(message = "No puede estar en vacio") Double numero2,
			@NotBlank(message = "Neceseitas una operacion valida") String operacion, String contenido,
			String resultadoCifrado) {
		super();
		this.id = id;
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.operacion = operacion;
		this.contenido = contenido;
		this.resultadoCifrado = resultadoCifrado;
	}

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
