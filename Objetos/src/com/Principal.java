package com;

public class Principal {
	public static void main(String args[]) {
		Agenda a=new Agenda();
		
		a.setNombre("Mario");
		a.setNumero("5569048088");
		a.setEdad(20);
		a.setDomicilio("tlaxcala,puebla");
        a.setCorreo("mari_20@gmail.com");
		
	    System.out.println(a.getNombre());
        System.out.println(a.getDomicilio());
        System.out.println(a.getCorreo());
		
        Agenda a2=new Agenda("maria","7351121010",23,"lospinos","mari_db@gmail.com");
        System.out.println(a2);

	}


}
