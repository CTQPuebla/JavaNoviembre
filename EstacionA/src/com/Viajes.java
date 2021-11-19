package com;

public class Viajes extends Conductor {
	public Viajes() {
		// TODO Auto-generated constructor stub
	}

	public String origen;
	public String destino;
	public String fechaSalida;
	public double precio;
	



	public Viajes(String nombreT, String direccionT, String modelo, String marca, String placa, int nAsientos,
			String ine, String nombre, String edad, String origen, String destino, String fechaSalida, double precio) {
		super(nombreT, direccionT, modelo, marca, placa, nAsientos, ine, nombre, edad);
		this.origen = origen;
		this.destino = destino;
		this.fechaSalida = fechaSalida;
		this.precio = precio;
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

	public String getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(String fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	
	public String imprimirViajes() {
		return "Viajes \n[origen=" + origen + ", destino=" + destino + ", fechaSalida=" + fechaSalida + ", precio="
				+ precio + ",\nDatos del condictor \nine=" + ine + ", nombre=" + nombre + ", edad=" + edad + ","
						+ "\nAuntobus: \n modelo=" + modelo + ", marca="
				+ marca + ", placa=" + placa + ", nAsientos=" + nAsientos + ",\nTerminal \nnombreT=" + nombreT + ", direccionT="
				+ direccionT + "]";
	}
	
	
	
	
	



}
