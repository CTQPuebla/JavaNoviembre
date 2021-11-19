package com;

public class Boleto {
	
	String fechaCompra;
	Usuario u;
	Viajes v;
	
	public Boleto() {
		
	}

	public Boleto(String fechaCompra, Usuario u, Viajes v) {
		this.fechaCompra = fechaCompra;
		this.u = u;
		this.v = v;
	}

	public String getFechaCompra() {
		return fechaCompra;
	}

	public void setFechaCompra(String fechaCompra) {
		this.fechaCompra = fechaCompra;
	}

	public Usuario getU() {
		return u;
	}

	public void setU(Usuario u) {
		this.u = u;
	}

	public Viajes getV() {
		return v;
	}

	public void setV(Viajes v) {
		this.v = v;
	}

	@Override
	public String toString() {
		return "Boleto [fechaCompra=" + fechaCompra + ", u=" + u + ", v=" + v + "]";
	}
	

}
