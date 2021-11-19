package com;

public class Sucursal {
	
	String dirreccion;
	int numeroEmpleados;
	
	public Sucursal() {
	
	}

	public Sucursal(String dirreccion, int numeroEmpleados) {
		
		this.dirreccion = dirreccion;
		this.numeroEmpleados = numeroEmpleados;
	}

	public String getDirreccion() {
		return dirreccion;
	}

	public void setDirreccion(String dirreccion) {
		this.dirreccion = dirreccion;
	}

	public int getNumeroEmpleados() {
		return numeroEmpleados;
	}

	public void setNumeroEmpleados(int numeroEmpleados) {
		this.numeroEmpleados = numeroEmpleados;
	}

	@Override
	public String toString() {
		return "Sucursal [dirreccion=" + dirreccion + ", numeroEmpleados=" + numeroEmpleados + "]";
	}
	
	
	

}
