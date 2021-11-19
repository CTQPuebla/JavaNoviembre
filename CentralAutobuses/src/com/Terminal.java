package com;

import java.util.List;

public class Terminal {
	private String domicilio;
	private int numAndenes;
	private List<Viaje> viajes;
	
	public Terminal() {
		
	}

	public Terminal(String domicilio, int numAndenes, List<Viaje> viajes) {
		super();
		this.domicilio = domicilio;
		this.numAndenes = numAndenes;
		this.viajes = viajes;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public int getNumAndenes() {
		return numAndenes;
	}

	public void setNumAndenes(int numAndenes) {
		this.numAndenes = numAndenes;
	}

	public List<Viaje> getViajes() {
		return viajes;
	}

	public void setViajes(List<Viaje> viajes) {
		this.viajes = viajes;
	}

	@Override
	public String toString() {
		return "Terminal [domicilio=" + domicilio + ", numAndenes=" + numAndenes + ", viajes=" + viajes + "]";
	}
	
	public void consultarViajes() {
		String datos = "- - - - - - - - - - - - - - - - - - - - - - - - - \n";
		for (Viaje viaje : viajes) {
			Autobus auxAutobus = new Autobus();
			for (Autobus autobus : viaje.getLn().getList()) {
				if (autobus.getFolio() == viaje.getFolio()) {
					auxAutobus = autobus;
				}
			}
			
			datos += "Origen: " + viaje.getOrigen() + 
					"\nDestino: " + viaje.getDestino() + 
					"\nLiena: " + viaje.getLn().getNombre() + 
					"\nFecha de Salida: " + viaje.getFecha() + "hrs" +
					"\nPrecio: " + viaje.getPrecio() + 
					"\nAutobus: " + auxAutobus.getPlacas() + 
					"\nAsientos Disponibles: " + auxAutobus.getAsientosOcupados() + "\n";
			System.out.println(datos);
			datos = "- - - - - - - - - - - - - - - - - - - - - - - - - \n";
		}
	}
	
	public String comparBoleto() {
		return null;
	}
}
