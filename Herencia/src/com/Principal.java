package com;

public class Principal {
	public static void main(String[] args) {
		
		
		//modificadores de acceso public, private y protected
		//padre
		SerVivo s = new SerVivo();
		s.setNombre("Mario");
		s.setPeso("70");
		
		System.out.println(s);
		
		//hijo
		Persona p = new Persona ();
		p.setNombre("Jose");
		p.setPeso("32");
		p.setFechaNacimiento("15 de abril");
		System.out.println(p);
	}

}
