package com;

public class Principal {

	public static void main(String[] args ) {
		
		
		Cliente c = new Cliente ();
		Cliente c2 = new Cliente ();
		Cliente c3 = new Cliente ();
		Cliente c4 = new Cliente ();
		
		c.setNombre("Daniela");
		c.setPeso("50");
		c.setRfc("ADFSRERY");
		c.setFechaDeNacimiento("22 de Noviembre de 1995");
		
		c2.setNombre("Daniel");
		c2.setPeso("70");
		c2.setRfc("DFDFERY");
		c2.setFechaDeNacimiento("22 de Junio de 1995");
		
		c3.setNombre("Navid");
		c3.setPeso("80");
		c3.setRfc("NASLRRY");
		c3.setFechaDeNacimiento("2 de Noviembre de 1996");
		
		c4.setNombre("Raul");
		c4.setPeso("85");
		c4.setRfc("RMFJFRERY");
		c4.setFechaDeNacimiento("25 de Julio de 1996");
		
		Sucursal s1 = new Sucursal ("calle 1", 12);
		Sucursal s2 = new Sucursal ("calle 4", 16);
		Sucursal s3 = new Sucursal ("calle 7", 22);
		Sucursal s4 = new Sucursal ("calle 9", 1);
		
		Cuenta cuenta = new Cuenta (30000,100000,5000,10,"debito", c, s1);
		Cuenta cuenta2 = new Cuenta (200,10000,100,12,"debito", c2, s2);
		Cuenta cuenta3 = new Cuenta (4800,8000,2000,14,"ahorro", c3, s3);
		Cuenta cuenta4 = new Cuenta (25000,70000,3000,16,"ahorro", c4, s4);
		
		List <Cuenta> list = ArryList <Cuenta>();
	
		list.add(cuenta);
		list.add(cuenta2);
		list.add(cuenta3);
		list.add(cuenta4);
		
		Banco b = new Banco (nombre, nacionalidad, oficinaCentral, list);
	}
}
