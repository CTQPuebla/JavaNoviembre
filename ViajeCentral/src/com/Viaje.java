package com;

public class Viaje {
	String origen;
	String destino;
	String fecha;
	Bus b;
	Chofer ch;
	double precio;
	String horaSalida;
	
	
	public Viaje() {
		
	}




	public Viaje(String origen, String destino, String fecha, Bus b, Chofer ch, double precio, String horaSalida) {
		super();
		this.origen = origen;
		this.destino = destino;
		this.fecha = fecha;
		this.b = b;
		this.ch = ch;
		this.precio = precio;
		this.horaSalida = horaSalida;
	}




	public String getOrigen() {
		return origen;
	}


	public void setOrigen(String origen) {
		this.origen = origen;
	}


	public String getDestino() {
		return destino;
	}


	public void setDestino(String destino) {
		this.destino = destino;
	}


	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public Bus getB() {
		return b;
	}


	public void setB(Bus b) {
		this.b = b;
	}


	public Chofer getCh() {
		return ch;
	}


	public void setCh(Chofer ch) {
		this.ch = ch;
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}
	


	public String getHoraSalida() {
		return horaSalida;
	}




	public void setHoraSalida(String horaSalida) {
		this.horaSalida = horaSalida;
	}




	@Override
	public String toString() {
		return "Viaje [origen=" + origen + ", destino=" + destino + ", fecha=" + fecha + ", b=" + b + ", ch=" + ch
				+ ", precio=" + precio + ", horaSalida=" + horaSalida + "]";
	}




	


}
