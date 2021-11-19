package com;

import java.util.ArrayList;
import java.util.*;

public class principal {

	public static void main(String[] args) {
		Cliente c = new Cliente();
		Cliente c2 = new Cliente();
		Cliente c3 = new Cliente();
		Cliente c4 = new Cliente();

		c.setNombre("Josias");
		c.setPeso("60");
		c.setFechaNacimiento("18 de agosto de 1996");
		c.setRfc("GUJJ960818HOCT");
		
		c2.setNombre("Omar");
		c2.setPeso("70");
		c2.setFechaNacimiento("17 de febrero de 1996");
		c2.setRfc("OMJJ960818HOCT");
		
		c3.setNombre("juan");
		c3.setPeso("80");
		c3.setFechaNacimiento("2 de marzo de 1995");
		c3.setRfc("JUJJ960818HOCT");
		
		c4.setNombre("maria");
		c4.setPeso("55");
		c4.setFechaNacimiento("18 de octubre de 1997");
		c4.setRfc("MAJJ960818HOCT");
		
		// CREACION DE SUCURSAL
		
		Sucursal su1=new Sucursal("calle 1", 12);
		Sucursal su2=new Sucursal("calle 2", 20);
		Sucursal su3=new Sucursal("calle 3", 30);
		Sucursal su4=new Sucursal("calle 4", 10);
		
		// CREACION DE CUENTAS
		//                    folio, saldo, min,  max, tipoCuenta, Cliente, Sucursal
		Cuenta cu1=new Cuenta(30000, 9000, 5000, 20000, "debito", c, su1);
		Cuenta cu2=new Cuenta(32134, 1000, 3300, 10000, "debito", c, su1);
		Cuenta cu3=new Cuenta(22344, 2300, 2200, 10000, "debito", c, su1);
		Cuenta cu4=new Cuenta(24242, 5000, 5000, 10000, "debito", c, su1);
		
		List<Cuenta> list =new ArrayList<Cuenta>();
		
		list.add(cu1);
		list.add(cu2);
		list.add(cu3);
		list.add(cu4);
		
		
		// CREACION DE OBJETO BANCO
		
		//banco b=new banco("Bancomer", "Juchitan", "Mexicana", list);
		//System.out.println(b);
		//deposito 
		Object o= cu3.depositar(cu3, 5000);
		System.out.println(o);
		
		//retiro
		Object o1= cu3.retirar(cu3, 105);
		System.out.println(o1);
		
		
		

	}
}
