package com;

public class Venta {
	String producto;
	int monto;
	String cliente;
	String fecha;
	
	
	public Venta() {
		
		
		
	}

	public Venta(String producto, int monto, String cliente, String fecha) {
	
		this.producto = producto;
		this.monto = monto;
		this.cliente = cliente;
		this.fecha = fecha;
	}

	public String getProducto() {
		return producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Venta [producto=" + producto + ", monto=" + monto + ", cliente=" + cliente + ", fecha=" + fecha + "]";
	}
	
	
	
	

}
