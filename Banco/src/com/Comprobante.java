package com;

public class Comprobante {
	
	String fecha;
	String lugar;
	int numCuenta;
	double monto;
	
	
	public Comprobante() {
		
	}


	public Comprobante(String fecha, String lugar, int numCuenta, double monto) {
		super();
		this.fecha = fecha;
		this.lugar = lugar;
		this.numCuenta = numCuenta;
		this.monto = monto;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getLugar() {
		return lugar;
	}


	public void setLugar(String lugar) {
		this.lugar = lugar;
	}


	public int getNumCuenta() {
		return numCuenta;
	}


	public void setNumCuenta(int numCuenta) {
		this.numCuenta = numCuenta;
	}


	public double getMonto() {
		return monto;
	}


	public void setMonto(double monto) {
		this.monto = monto;
	}


	@Override
	public String toString() {
		return "Comprobante [fecha=" + fecha + ", lugar=" + lugar + ", numCuenta=" + numCuenta
				+ ", monto=" + monto + "]";
	}
	
	

}
