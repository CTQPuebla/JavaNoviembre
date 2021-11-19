package Viajes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Terminal {

	String dirrecion;
	int numAndenes;
	List<Viaje> lv= new ArrayList<Viaje>();
	List<Boleto> lb= new ArrayList<Boleto>();

	public Terminal() {
	}

	public Terminal(String dirrecion, int numAndenes) {
		super();
		this.dirrecion = dirrecion;
		this.numAndenes = numAndenes;
	}

	public String getDirrecion() {
		return dirrecion;
	}

	public void setDirrecion(String dirrecion) {
		this.dirrecion = dirrecion;
	}

	public int getNumAndenes() {
		return numAndenes;
	}

	public void setNumAndenes(int numAndenes) {
		this.numAndenes = numAndenes;
	}

	@Override
	public String toString() {
		return "Terminal [dirrecion=" + dirrecion + ", numAndenes=" + numAndenes + "]";
	}

	// CREACION DE LOS VIAJES
	public void ConfigurarViajes(String origen, String destino, String fecha, String hora, Autobus bus, Chofer ch,
			double precio) {

		Viaje v = new Viaje(origen, destino, fecha, bus, ch, precio, hora);
		// AÑADO EL VIAJE
		lv.add(v);
	}

	public Object[] ConsultarViajes(String origen, String destino) {
		// BUSQUEDA EN LA LISTA DE VIAJES
		System.out.println(origen);
		System.out.println(destino);
		Autobus bus;
		Object[] respuesta = new Object[3];
		
		System.out.println("tamaño lista"+lv.size());
		for (int i = 0; i < lv.size(); i++) {
			bus = lv.get(i).getAu();
			if (lv.get(i).getOrigen().equals(origen) && lv.get(i).getDestino().equals(destino)
					&& bus.getNumAsientos() <= bus.getmax()) {
			
				
				Viaje viaje = lv.get(i);

				respuesta[0] = viaje;
				respuesta[1] = "viaje disponible";
				respuesta[2] = true;
				return respuesta;

			}
		}
		respuesta[0] = null;
		respuesta[1] = "nose encontro viaje";
		respuesta[2] = false;

		return respuesta;
	}
	
	public Object comprarBoleto(String origen, String destino, Cliente cl) {
		
		Object [] respuesta=this.ConsultarViajes(origen, destino);
		Viaje  v =  (Viaje) respuesta [0];
		if(respuesta[2].equals(true)) {
			
			Boleto b= new Boleto("18 nov 2021", cl, v);
			lb.add(b);
			return b;
			
		}else {
			return "No disponible";
		}
	}

}
