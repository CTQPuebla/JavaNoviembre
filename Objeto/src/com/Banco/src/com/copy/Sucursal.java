package com.Banco.src.com.copy;

public class Sucursal {
	
	
	String direccion;
	int numeroEmpleados;
	
	public Sucursal() {
		
	}

	public Sucursal(String direccion, int numeroEmpleados) {
		this.direccion = direccion;
		this.numeroEmpleados = numeroEmpleados;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNumeroEmpleados() {
		return numeroEmpleados;
	}

	public void setNumeroEmpleados(int numeroEmpleados) {
		this.numeroEmpleados = numeroEmpleados;
	}

	@Override
	public String toString() {
		return "Sucursal [direccion=" + direccion + ", numeroEmpleados=" + numeroEmpleados + "]";
	}
	
}
