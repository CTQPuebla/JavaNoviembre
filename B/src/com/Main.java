package com;

public class Main {

	public static void main(String[] args) {
		
		
		//Modificadores de acceso
		//public (default)
		//private
		//protected
		
		Servivo s=new Servivo();
		
		s.setNombre("Fabian");
		s.setPeso("60");
		
		System.out.println(s);
		
		
		Persona p=new Persona();
		
		p.setNombre("Fabiann");
		p.setPeso("66");
		
		p.setFechaNacimiento("06 de Febrero de 1997");
		
		System.out.println(p);

	}

}
