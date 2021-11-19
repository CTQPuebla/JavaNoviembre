package com;

public class Principal {
	public static void main(String args[]) {
		Servivo s=new Servivo();
		s.setNombre("samantha");
		s.setPeso("49");
		System.out.println(s);
		
		Persona p=new Persona();
		p.setNombre("samantha");
		p.setPeso("49");
		p.setFechaNac("22 abril 1998");
		System.out.println(p);
		
		Origen o=new Origen();
		o.setNombre("samantha");
		o.setPeso("49");
		o.setFechaNac("06 Marzo 1996");
	    o.setLugarNac("Cuautla");
		o.setEstadoNac("Morelos");
		System.out.println(o);
		
		
		
		
		
	}

}
