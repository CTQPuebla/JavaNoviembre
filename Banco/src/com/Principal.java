package com;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String args[]) {
		Cliente c=new Cliente();
		Cliente c2=new Cliente();
		Cliente c3=new Cliente();
		Cliente c4=new Cliente();
		
		c.setNombre("Marco Antonio");
		c.setPeso("90");
		c.setFechaNac("22 de abril 1998");
		c.setRfc("catagbaga");
		
		c2.setNombre("Ana Catonga");
		c2.setPeso("30");
		c2.setFechaNac("22 de marzo");
		c2.setRfc("catagbaga");
		
		c3.setNombre("Ana Maria");
		c3.setPeso("90");
		c3.setFechaNac("22 de abril 1998");
		c3.setRfc("catagbaga");
		
		c4.setNombre("Silvia Telomico");
		c4.setPeso("90");
		c4.setFechaNac("22 de abril 1998");
		c4.setRfc("catagbaga");
		
		
		//creacion de sucursales
		Sucursal su1=new Sucursal(26,"puebla");
		Sucursal su2=new Sucursal(28,"puebla centro");
		Sucursal su3=new Sucursal(30,"puebla poniente");
		Sucursal su4=new Sucursal(32,"puebla sur");
		//creacion de cuentas
		Cuenta cuenta=new Cuenta(3000,10000,5000,10,"debito",c,su1);
		Cuenta cuenta2=new Cuenta(5000,10000,5000,12,"ahorro",c,su1);
		Cuenta cuenta3=new Cuenta(4800,8000,2000,14,"debito",c,su1);
		Cuenta cuenta4=new Cuenta(8000,10000,5000,14,"ahorro",c,su1);
		
		List<Cuenta> list=new ArrayList<Cuenta>();
		list.add(cuenta);
		list.add(cuenta2);
		list.add(cuenta3);
		list.add(cuenta4);
		
		//creacion del objeto banco
		Banco b=new Banco("Bancomer","Española","Calle 1 Valencia",list);
		System.out.println(b);
		Object o= cuenta3.depositar(cuenta3, 3201);
		Object r= cuenta.retirar(cuenta, 1000);
		System.out.println(o);
		System.out.println(r);

		
		

		
	}

}
