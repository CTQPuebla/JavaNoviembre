package Banco;

import java.util.*;
import java.util.ArrayList;

public class Principal {
	public static void main(String[] args) {
		
		Cliente c=new Cliente();
		Cliente c1=new Cliente();
		Cliente c2=new Cliente();
		Cliente c3=new Cliente();
		Cliente c4=new Cliente();
		
		c.setNombre("Felipe");
		c.setPeso("90");
		c.setFechaNacimiento("12 de Enero de 1988");
		c.setRfc("F283727716");
		
		c1.setNombre("Manuel");
		c1.setPeso("30");
		c1.setFechaNacimiento("15 de abril de 1996");
		c1.setRfc("sh726326");
		
		c2.setNombre("Josias");
		c2.setPeso("10");
		c2.setFechaNacimiento("18 de agosto de 1996");
		c2.setRfc("JSGSG654");
		
		c3.setNombre("Andres");
		c3.setPeso("50");
		c3.setFechaNacimiento("18 DE NOVIEMBRE DE 1996");
		c3.setRfc("JJSSJAJSASK");
		
		c4.setNombre("Anastacio");
		c4.setPeso("50");
		c4.setFechaNacimiento("30 de diciembre de 1998");
		c4.setRfc("FJSHSSAJ");
		
		//Crear suscursales 
		
		Sucursal su1=new Sucursal("Leona vicario s/n",12);
		Sucursal su2=new Sucursal("Indepencia ",17);
		Sucursal su3=new Sucursal("Morelos s/n",20);
		Sucursal su4=new Sucursal("Hidalgo s/n",10);
		
		//Creacion de cuentas 
		//                      Folio  saldo  minimo  maximo, tipo  cuenta, sucursal
		Cuenta cuenta=new Cuenta(0000,100.00,10,5000,"Debito",c,su1);
		Cuenta cuenta2=new Cuenta(1111,100.00,10,5000,"Credito",c2,su2);
		Cuenta cuenta3=new Cuenta(2222,100.00,10,30000,"Debito",c3,su3);
		Cuenta cuenta4=new Cuenta(4444,100.00,10,5000,"Credito",c4,su4);
		
		
		List<Cuenta> list=new ArrayList<Cuenta>();
		list.add(cuenta);
		list.add(cuenta2);
		list.add(cuenta3);
		list.add(cuenta4);
		
		//Creacion del objeto de cuenta 
		////Banco b=new Banco("BBVA ","Juchitan ","Mexicana",list);
		// System.out.print(b);
		
		
		//Depoosito
		Object o=cuenta3.depositar(cuenta3,100);
		System.out.println(o);
		
		//Retiro
		Object a=cuenta3.retirar(cuenta3,1);
		System.out.println(a);
		
		//Trasferencia 
		Object x=cuenta3.tranferir(cuenta, cuenta2, 7);
		System.out.println(x);
		
		
		
		
		
	}

}
