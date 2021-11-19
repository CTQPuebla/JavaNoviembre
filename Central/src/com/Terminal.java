package com;
import java.util.*;

public class Terminal {
	
	String domicilio;
	int numAndenes;
	
	List <Viajes> lv= new ArrayList<Viajes>();
	List <Boleto> lb = new ArrayList<Boleto>();
	
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

	@Override
	public String toString() {
		return "Terminal [domicilio=" + domicilio + ", numAndenes=" + numAndenes + "]";
	}
	
	
	public void ConfigurarViajes(String origen, String destino, String fecha, String hora, Autobus bus,Chofer ch, double precio) {
		
		Viajes v=new Viajes(origen, destino, fecha, bus, ch, precio, hora);
		
		lv.add(v);
		
		
	}
	
	
	
	public Object []ConsultarViajes(String origen, String destino) {
		
		
		Autobus bus;
		Object [] respuesta=new Object[3];
		
		//Hcer una busqueda en la lista de viajes 
		for (int i=0;i<lv.size();i++) {
			bus=lv.get(i).getBus();
			
			if(lv.get(i).getOrigen().equals(origen) && lv.get(i).getDestino().equals(destino)  && bus.getNumAsientos()<=bus.getMax()) {
				
				Viajes viaje=lv.get(i);
				
				respuesta[0]=viaje;
				respuesta[1]="Viaje Disppnible";
				respuesta[2]=true;
				
				return respuesta;
		
			}
			
		}
		
		respuesta[0]=null;
		respuesta[1]="No se encontro el viaje";
		respuesta[2]=false;
		
		
		return respuesta;
	}
	
	
	
	public Object ComprarBoleto(String origen, String destino, Usuario u) {
		
		Object [] respuesta=this.ConsultarViajes(origen, destino);
		Viajes v=(Viajes)respuesta[0];
		
		if(respuesta[2].equals(true)) {
			
			Boleto b=new Boleto("12-12-2021",u,v);
			
			lb.add(b);
			return b;
			
		}else {
			return "No disponible";
			
		}
		
	
	}
	
	

}
