package com;

public class Sucursal {

	String direccion;
	String noDeEmpleados;
	
	public Sucursal () {
		
	}

	public Sucursal(String direccion, String noDeEmpleados) {
		super();
		this.direccion = direccion;
		this.noDeEmpleados = noDeEmpleados;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNoDeEmpleados() {
		return noDeEmpleados;
	}

	public void setNoDeEmpleados(String noDeEmpleados) {
		this.noDeEmpleados = noDeEmpleados;
	}

	@Override
	public String toString() {
		return "Sucursal [direccion=" + direccion + ", noDeEmpleados=" + noDeEmpleados + "]";
	}
	
	
	}
	
	
