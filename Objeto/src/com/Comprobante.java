package com;

public class Comprobante {
	
	String fecha;
	String direccion;
	int numCuenta;
	int monto;
	
	public Comprobante() {
		
	}

	public Comprobante(String fecha, String direccion, int numCuenta, int monto) {
		this.fecha = fecha;
		this.direccion = direccion;
		this.numCuenta = numCuenta;
		this.monto = monto;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNumCuenta() {
		return numCuenta;
	}

	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "Comprobante [fecha=" + fecha + ", direccion=" + direccion + ", numCuenta=" + numCuenta + ", monto="
				+ monto + "]";
	}
	
	

}
