package com.Banco.src.com.copy;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	
	
	public static void main(String[] args) {
		
		//Creacion de clientes
		Cliente c = new Cliente();
		Cliente c2 = new Cliente();
		Cliente c3= new Cliente();
		Cliente c4 = new Cliente();
		
		c.setNombre("Felipe");
		c.setPeso("90");
		c.setFechaNacimiento("12 Enero 1980");
		c.setRfc("FSDD234242");
		
		
		c2.setNombre("Omar");
		c2.setPeso("70");
		c2.setFechaNacimiento("12 Marzo 1990");
		c2.setRfc("b45yyhd56");
		
		c3.setNombre("Laura");
		c3.setPeso("60");
		c3.setFechaNacimiento("12 Octubre 1983");
		c3.setRfc("345yv36ub357");
		
		c4.setNombre("Gloria");
		c4.setPeso("65");
		c4.setFechaNacimiento("12 Noviembre 1997");
		c4.setRfc("v354y245b");
		
		System.out.println(c4);
		
//		Creacion de sucursales
//		Sucursal su1 = new Sucursal("calle 1", 12);
//		Sucursal su2 = new Sucursal("calle 12", 20);
//		Sucursal su3 = new Sucursal("calle 13", 8);
//		Sucursal su4 = new Sucursal("calle 14", 15);
//		
//		//Creacion de cuentas
//		Cuenta cuenta = new Cuenta(30000, 100000, 5000, 10, "debito", c, su1);
//		Cuenta cuenta2 = new Cuenta(200, 10000, 100, 12, "debito", c2, su2);
//		Cuenta cuenta3 = new Cuenta(4800, 8000, 2000, 14, "ahorro", c3, su3);
//		Cuenta cuenta4 = new Cuenta(25000, 70000, 3000, 16, "ahorro", c4, su4);
//		
//		List<Cuenta> list = new ArrayList<Cuenta>();
//		
//		list.add(cuenta);
////		list.add(cuenta2);
////		list.add(cuenta3);
////		list.add(cuenta4);
//		
//		//Creacion del objeto banco
//		Banco b = new Banco("Bancomer", "Española", "Calle 1 Valencia", list);
//		
//		System.out.println(b);
		
//		Object o = cuenta3.depositar(cuenta3, 2000);
//		
//		Object a = cuenta3.retirar(cuenta3, 4801);
//		
//		Object x = cuenta.transferir(cuenta, cuenta2, 5000);
//		System.out.println(o);
//		System.out.println(a);
	}
	
	

}
