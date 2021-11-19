package com;

public class Comprobante {
	String fecha;
	String direccion;
	int numCtaDes;
	int monto;
	
	public Comprobante() {
		
	}

	public Comprobante(String fecha, String direccion, int numCtaDes, int monto) {
		super();
		this.fecha = fecha;
		this.direccion = direccion;
		this.numCtaDes = numCtaDes;
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

	public int getNumCtaDes() {
		return numCtaDes;
	}

	public void setNumCtaDes(int numCtaDes) {
		this.numCtaDes = numCtaDes;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	@Override
	public String toString() {
		return "Comprobante [fecha=" + fecha + ", direccion=" + direccion + ", numCtaDes=" + numCtaDes + ", monto="
				+ monto + "]";
	}


}
