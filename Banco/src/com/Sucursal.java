package com;

public class Sucursal {

	public Sucursal() {

	}

	int nEmpleados;
	String direccion;

	public Sucursal(int nEmpleados, String direccion) {

		this.nEmpleados = nEmpleados;
		this.direccion = direccion;
	}

	public int getnEmpleados() {
		return nEmpleados;
	}

	public void setnEmpleados(int nEmpleados) {
		this.nEmpleados = nEmpleados;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Sucursal [nEmpleados=" + nEmpleados + ", direccion=" + direccion + "]";
	}

}
