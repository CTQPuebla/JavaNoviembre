package com;


import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	public static void main(String[] args) {
		 Cliente c = new Cliente();
		 Cliente c1 = new Cliente();
		 Cliente c2 = new Cliente();
		 Cliente c3 = new Cliente();
		 Cliente c4 = new Cliente();
		 
		 
		 c.setNombre("Felipe");
		 c.setPeso("90");
		 c.setFechaNacimiento("15 de abril 1995");
		 c.setRfc("FSDD324545");
		 
		 c1.setNombre("Omar");
		 c1.setPeso("70");
		 c1.setFechaNacimiento("12 de enero 1980");
		 c1.setRfc("FSDD32448425");
		 
		 c2.setNombre("Javier");
		 c2.setPeso("45");
		 c2.setFechaNacimiento("15 de Febrero 1980");
		 c2.setRfc("FDF24582");
		 
		 c3.setNombre("Miguel");
		 c3.setPeso("47");
		 c3.setFechaNacimiento("17 de Junio 1980");
		 c3.setRfc("JGS27412658");
		 
		 c4.setNombre("Fanny");
		 c4.setPeso("28");
		 c4.setFechaNacimiento("15 de Agosto 1980");
		 c4.setRfc("GAJU564545");
		 
		 //Creaccion de sucursales
		 Sucursal su1 = new Sucursal("Calle 1",12);
		 Sucursal su2 = new Sucursal("Calle 12",20);
		 Sucursal su3 = new Sucursal("Calle 14",35);
		 Sucursal su4 = new Sucursal("Calle 20",98);
		 
		 //Creacion de cuentas
		Cuenta cuenta = new Cuenta(30000, 100000, 5000, 10, "debito", c, su1);
		Cuenta cuenta2 = new Cuenta(200, 10000, 100, 12, "debito", c2, su2);
		Cuenta cuenta3 = new Cuenta(4800, 8000, 2000, 14, "ahorro", c3, su3);
		Cuenta cuenta4 = new Cuenta(25000, 70000, 3000, 16, "ahorro", c4, su3);
		
		List<Cuenta> list = new ArrayList<Cuenta>();
		list.add(cuenta);
		list.add(cuenta2);
		list.add(cuenta3);
		list.add(cuenta4);
		
		 
		
		//Creacion del objeto banco
		Banco b = new Banco("Bancomer", "Calle Valencia", "Española", list);
		System.out.println(b);
		
		//Deposito
		Object o = cuenta3.depositar(cuenta3, 2000);
		System.out.println(o);
		
		//Retiro
		Object a = cuenta3.retirar(cuenta3, 4800);
		System.out.println(a);
		
		Object x = cuenta.transferir(cuenta, cuenta2, 5000);
		System.out.println(x);
		 
	}

}
