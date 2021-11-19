package com;

import java.text.SimpleDateFormat;  
import java.util.Date;  

public class PracticaUno {
	public static void main(String[] args) {
		//Persona p1 = new Persona("Nicolas", 25, "CDA Aldama");
		//System.out.println(p1.toString());
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
	    Date date = new Date();  
		Cliente c1 = new Cliente("Nicolas", 25, "Aldama", 1, new Date(), true);
		
		System.out.println(c1.toString());
	}
}
