package com;

public class Comprobante {

	public Comprobante() {

	}

	String fecha;
	String lugar;
	int id;
	String nCuenta;
	double monto;

	public Comprobante(String fecha, String lugar, int id, String nCuenta, int monto) {
		super();
		this.fecha = fecha;
		this.lugar = lugar;
		this.id = id;
		this.nCuenta = nCuenta;
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getnCuenta() {
		return nCuenta;
	}

	public void setnCuenta(String nCuenta) {
		this.nCuenta = nCuenta;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "Comprobante [fecha=" + fecha + ", lugar=" + lugar + ", id=" + id + ", nCuenta=" + nCuenta + ", monto="
				+ monto + "]";
	}

}
