package com;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] agr) {
		Viajes imprimirViajes =new Viajes();		

		imprimirViajes.setDestino("Guerrero");
		imprimirViajes.setOrigen("Puebla");
		imprimirViajes.setNombreT("Capu");
		imprimirViajes.setDireccionT("Concida #25");
		imprimirViajes.setModelo("2015");
		imprimirViajes.setMarca("Ford");
		imprimirViajes.setPlaca("SDSD1587");
		imprimirViajes.setnAsientos(52);
		imprimirViajes.setNombre("Fabian");
		imprimirViajes.setIne("dfsdf");
		imprimirViajes.setEdad("24");
		imprimirViajes.setPrecio(500);
		imprimirViajes.setFechaSalida("25 de Noviembre");
		
		

		System.out.println(imprimirViajes.imprimirViajes());

	}

}
