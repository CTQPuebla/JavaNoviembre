package com;

import java.util.ArrayList;
import java.util.List;

public class Terminal {
	
	String domicilio;
	int numAndenes;
	//DB de viajes
	List<Viajes> lv = new ArrayList<Viajes>();
	//DB de Boletos vendidos
	List<Boleto> lb = new ArrayList<Boleto>();
	
	public Terminal() {
		
	}

	public Terminal(String domicilio, int numAndenes) {

		this.domicilio = domicilio;
		this.numAndenes = numAndenes;
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
	
	//Creacion de los viajes
	public void configurarViajes(String origen, String destino, String fecha, String hora, Autobus bus, Chofer ch, double precio) {		
		Viajes v = new Viajes(origen, destino, fecha, bus, ch, precio, hora);
		//Añado el viaje
		
		lv.add(v);
	}
	
	
	
	public Object[] consultarViajes(String origen, String destino) {
		Autobus bus;
		Object[] respuesta  = new Object[3];
		//Busqueda en la lista de viajes
		for (int i = 0; i < lv.size(); i++) {
			//Bus temporal
			bus = lv.get(i).getBus();
			if(lv.get(i).getOrigen().equals(origen)&&
					lv.get(i).getDestino().equals(destino) && bus.getNumAsientos()<bus.getMax()) {
				//Aislo el objeto viaje filtrado
				Viajes viaje = lv.get(i);

				respuesta[0] = viaje;
				respuesta[1] = "Viaje Disponible";
				respuesta[2] = true;
				return respuesta;
			}
		}
		respuesta[0] = null;
		respuesta[1] = "No se encontro un viaje";
		respuesta[2] = false;
		return respuesta;
	}
	
	
	public Object comprarBoleto(String origen, String destino, Usuario u) {
		
		Object[] respuesta = this.consultarViajes(origen, destino);		
		Viajes v = (Viajes) respuesta[0];		
		if(respuesta[2].equals(true)) {
			Boleto b = new Boleto("12-12-2000", u, v);
			//guardamos el boleto en una lista
			lb.add(b);			
			//retornamos el resultado final
			return b;			
		}else {
			return "No disponible";
		}
	}
	
	
	
	
	

}

