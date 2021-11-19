package com;

public class Comprobante {

	String fecha;
	String Direccion;
	int numerocuenta;
	double monto;
	public Comprobante()
       {
		}
	public Comprobante(String fecha, String direccion, int numerocuenta, double monto) {
		super();
		this.fecha = fecha;
		Direccion = direccion;
		this.numerocuenta = numerocuenta;
		this.monto = monto;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public int getNumerocuenta() {
		return numerocuenta;
	}
	public void setNumerocuenta(int numerocuenta) {
		this.numerocuenta = numerocuenta;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
	@Override
	public String toString() {
		return "Comprobante [fecha=" + fecha + ", Direccion=" + Direccion + ", numerocuenta=" + numerocuenta
				+ ", monto=" + monto + "]";
	}
	
	
	
}
