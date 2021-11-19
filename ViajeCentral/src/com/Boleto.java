package com;

public class Boleto {
	 String fechaCompra;
	 Pasajero p;
	 Viaje v;
	
	public Boleto() {
		
	}

	public Boleto(String fechaCompra, Pasajero p, Viaje v) {
		super();
		this.fechaCompra = fechaCompra;
		this.p = p;
		this.v = v;
	}

	public String getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public Pasajero getP() {
		return p;
	}

	public void setP(Pasajero p) {
		this.p = p;
	}

	public Viaje getV() {
		return v;
	}

	public void setV(Viaje v) {
		this.v = v;
	}

	@Override
	public String toString() {
		return "Boleto [fechaCompra=" + fechaCompra + ", p=" + p + ", v=" + v + "]";
	}

	

}
