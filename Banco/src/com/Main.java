package com;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Cliente c = new Cliente();
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();

		c.setNombre("fabian");
		c.setPeso("56");
		c.setFechaNacimiento("06 febrero de 1997");
		c.setRfc("dfdgdfg151");

		c1.setNombre("fabian");
		c1.setPeso("56");
		c1.setFechaNacimiento("06 febrero de 1997");
		c1.setRfc("dfdgdfg151");

		c2.setNombre("fabian");
		c2.setPeso("56");
		c2.setFechaNacimiento("06 febrero de 1997");
		c2.setRfc("dfdgdfg151");
		
		Sucursal su1=new Sucursal(12,"calle 8");
		Sucursal su2=new Sucursal(12,"calle 8");
		Sucursal su3=new Sucursal(12,"calle 8");
		
		
		Cuenta cuenta=new Cuenta(c,su1,"fsdfsdf",500,10,5000,"3");
		Cuenta cuenta1=new Cuenta(c1,su2,"fsdfsdf",500,10,5000,"3");
		Cuenta cuenta2=new Cuenta(c2,su3,"fsdfsdf",500,10,5000,"3");
		

		List<Cuenta> list=new ArrayList<Cuenta>();
		list.add(cuenta);
		list.add(cuenta1);
		list.add(cuenta2);
		
		Banco b=new Banco("BBVA", "oficiaCentral", "nacionalidad",list);
		
		System.out.println(b);
		Object object=cuenta.depositar(cuenta2, 20000);
		System.out.println(object);
		
		Object sObject=cuenta.depositar(cuenta, 700);
		System.out.print(sObject);
	}
  
}
