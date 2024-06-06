package com.operaciones.request;


public class OperacionRequest {
	
	int id;
	String operacion;
	
	public OperacionRequest() {}

	public OperacionRequest( String operacion) {
		super();
		this.operacion = operacion;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getOperacion() {
		return operacion;
	}

	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}

	@Override
	public String toString() {
		return "OperacionRequest [id=" + id + ", operacion=" + operacion + "]";
	}

	
}
