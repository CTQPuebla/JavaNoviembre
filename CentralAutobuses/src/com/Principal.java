package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		Chofer ch1 = new Chofer("Nicolas",25);
		Chofer ch2 = new Chofer("Omar",35);
		Chofer ch3 = new Chofer("Diego",45);
		
		List<Autobus> estrellaOro = new ArrayList<>();;
		Autobus atb1 = new Autobus("Primera Plus", "Sueca", "FTRE51", 45, false);
		Autobus atb2 = new Autobus("Primera Plus", "Sueca", "FTRE52", 45, false);
		Autobus atb3 = new Autobus("Primera Plus", "Sueca", "FTRE53", 45, false);
		estrellaOro.add(atb1);
		estrellaOro.add(atb2);
		estrellaOro.add(atb3);
		
		List<Autobus> futura = new ArrayList<>();
		Autobus atb4 = new Autobus("Primera Plus", "Sueca", "FTRE54", 45, false);
		Autobus atb5 = new Autobus("Primera Plus", "Sueca", "FTRE55", 45, false);
		Autobus atb6 = new Autobus("Primera Plus", "Sueca", "FTRE56", 45, false);
		futura.add(atb4);
		futura.add(atb5);
		futura.add(atb6);
		
		Linea ln1 = new Linea("Estrella de oro", estrellaOro);
		Linea ln2 = new Linea("Futura", futura);
		
		List<Viaje> viajes = new ArrayList<>();
		Viaje vj1 = new Viaje("Guerrero, Acapulco de Juarez", "Puebla, Puebla", "19-11-2021 13:00", ln1, ch1, 800.00);
		Viaje vj2 = new Viaje("Guerrero, Acapulco de Juarez", "CDMX, Central del Sur", "21-11-2021 17:00", ln2, ch3, 1000.00);
		Viaje vj3 = new Viaje("Guerrero, Acapulco de Juarez", "CDMX, Central del Norte", "19-11-2021 13:00", ln1, ch2, 750.00);
		Viaje vj4 = new Viaje("Guerrero, Acapulco de Juarez", "Puebla, Puebla", "20-11-2021 13:00", ln1, ch2, 800.00);
		Viaje vj5 = new Viaje("Guerrero, Acapulco de Juarez", "CDMX, Central del Sur", "19-11-2021 17:00", ln2, ch1, 1000.00);
		Viaje vj6 = new Viaje("Guerrero, Acapulco de Juarez", "Guerrero, Chipancingo", "23-11-2021 13:00", ln2, ch3, 300.00);
		viajes.add(vj1);
		viajes.add(vj2);
		viajes.add(vj3);
		viajes.add(vj4);
		viajes.add(vj5);
		viajes.add(vj6);
		
		Usuario us1 = new Usuario("Nicolas Omar Diego Hernandez", "08081996");
		Usuario us2 = new Usuario("Raziel Bibliano Solis", "09121995");
		Usuario us3 = new Usuario("Juan Hernandez Sanchez", "12121987");
		Usuario us4 = new Usuario("Nicolas Omar Diego Hernandez", "11012000");
		
		Terminal t1 = new Terminal("Guerrero, Acapulco de Juarez, Av Cuautemoc", 6, viajes);
		t1.consultarViajes();
		
		
	}

}
