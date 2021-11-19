package com;

import java.util.ArrayList;
import java.util.List;

public class Terminal {
	String domicilio;
	int numAnden;
	//BD de viajes
	List<Viaje> lv = new ArrayList<Viaje>();
	//BD de boletos
	List<Boleto> lb = new ArrayList<Boleto>();

	public Terminal() {

	}

	public Terminal(String domicilio, int numAnden) {
		super();
		this.domicilio = domicilio;
		this.numAnden = numAnden;
	}

	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}

	public int getNumAnden() {
		return numAnden;
	}

	public void setNumAnden(int numAnden) {
		this.numAnden = numAnden;
	}

	@Override
	public String toString() {
		return "Terminal [domicilio=" + domicilio + ", numAnden=" + numAnden + "]";
	}

	
	//se le da un comportamiento
	// Creacion de los viajes
	public void configurarViajes(String origen, String destino, String fecha, String hora, Bus b, Chofer ch,
			double precio) {

		Viaje v = new Viaje(origen, destino, fecha, b, ch, precio, hora);
		// Añado el viaje
		
		System.out.println("Mira aqui: " + v);
		lv.add(v);

	}

	public Object[] consultarViajes(String origen, String destino) {
		
		Bus b;
		Object [] respuesta = new Object [3];
		// busqueda en la lsita de viajes
		for (int i = 0; i < lv.size(); i++) {
			
			b = lv.get(i).getB();
			if (lv.get(i).getOrigen().equals(origen)&&
					lv.get(i).getDestino().equals(destino) && b.getNumAsientos()<b.getMax()) {
				
				Viaje v = lv.get(i);
				
				respuesta[0]= v;
				respuesta[1]="Viaje disponible";
				respuesta[2]= true;
				return respuesta;
			}				
		}
		respuesta[0]=null;
		respuesta[1]="No se encontro un viaje";
		respuesta[2]= false;
		return respuesta;	
	}
	public Object comprarBoleto(String origen, String destino, Pasajero p) {
		Object [] respuesta = this.consultarViajes(origen, destino);
	Viaje v = (Viaje)respuesta[0];
		
		if(respuesta[2].equals(true)) {
			
			Boleto b = new Boleto("12-12-22", p, v);
			//guardados el boleto en su lista
			lb.add(b);
			return b;
		}else {
			return "No disponible";
		}

}
}
