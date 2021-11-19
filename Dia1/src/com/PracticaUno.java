package com;

import java.util.Scanner;

public class PracticaUno {

	public static void main(String[] args) {
		
		/*System.out.println("8 de Noviembre 2021");
		
		double nn=12.8;
		int j=10;
		String m = "Hola";
		
		
		if(j==10 && m.equals("Hola")) {
			System.out.println("Se Cumple");
			
			
		}
		else {
			System.out.println("No se Cumple");
		}
		*/
		
		/*int dia =2;
		if(dia ==1) {
		}else if(dia==1){
			System.out.println("LUNES");
		}else if(dia==2) 
		{	System.out.println("MARTES");			
		}else if(dia==3) {
			System.out.println("MIERCOLES");
		}else if(dia==4) {
			System.out.println("JUEVES");
		}else if(dia==5) {
			System.out.println("VIERNES");
		}else {
			System.out.println("Ingresa un valor valido");
		}*/
			
		//Estructura Switch
		
		/*switch(dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Lunes");
			break;
		case 3:
			System.out.println("Lunes");
			break;
		case 4:
			System.out.println("Lunes");
			break;
		case 5:
			System.out.println("Lunes");
			break;
	
			default:
				System.out.println("Ingrese un valor válido");
		
		}*/
		
		
		/*double salario = 9200.60;
		
		if(salario >0 && salario <= 9000)
		{
			System.out.println("Nuevo Salario: "+ (salario+salario*.20));
		} else if(salario> 9000&&salario<=15000) {
			System.out.println("Nuevo Salario: "+ (salario+salario*.10));	
		} else if(salario> 15000&&salario<=20000) {
			System.out.println("Nuevo Salario: "+ (salario+salario*.05));	
		}else if(salario >20000) {
			System.out.println("Nuevo Salario: "+ (salario+salario*.03));
		}
			
		String k="Hola";
		int o=10;
		if(!(k.equals("Hola")&&o==10)) {
			
			System.out.println("Si se Cumple");
		}else {
			System.out.println("No se Cumple");
		}
		*/
		

//Ingrese 2 números enteros diferentes y visualizar el mayor de ellos.

//Determinar si una letra es mayúscula o no.



		
		/*int numero1 = 0;
		int numero2 = 0;
		System.out.println("Ingresa Numero 1: ");
		Scanner leer = new Scanner(System.in);
		numero1 = leer.nextInt();
		System.out.println("Ingresa Numero 2: ");
		Scanner leern = new Scanner(System.in);
		numero2 = leern.nextInt();
		if(numero1!=numero2) {
			if(numero1>numero2)
			{
				System.out.println("El numero "+ numero1 + " Es el numero mayor");
				
			}else {

				System.out.println("El numero "+ numero2 + " Es el numero mayor");
			}
			
		}else {
			System.out.println("Deben ser numeros diferentes");
		}*/
		
		
		//Una farmacia desea un programa para 
		//ingresar el valor de compra y calcular lo siguiente: 
		//si el pago se efectúa al “contado”, calcular un descuento del 5%; 
		//pero si el pago es con “tarjeta” se incrementa un recargo del 3% al valor de compra. 
		//Calcular y visualizar el descuento o recargo según sea el caso y el total a pagar de la compra.
		
		/*double Valor = 0;
		int tipoPago=0;
		
		System.out.println("Ingresa el valor de la compra");
		
		Scanner leerval = new Scanner(System.in);
		Valor = leerval.nextDouble();
		
		System.out.println(">> Ingresa como es el tipo de Pago <<"
				+ "\n 1)Efectivo"
				+ "\n 2)Tarjeta");
		
		Scanner Pago= new Scanner(System.in);
		tipoPago= Pago.nextInt();
		
		if(tipoPago==1) {
			System.out.println("El descuesto es de "+ (Valor*.05));
			System.out.println("El total de la Compra es "+ (Valor - Valor*.05));
			 
		}else if(tipoPago==2){
			System.out.println("El recargo es de "+ (Valor*.03));
			System.out.println("El total de la Compra es "+ (Valor + Valor*.03));
			 System.out.flush();
		}
		
		*/


		//Tiendas Don Pepe desea un programa para ingresar por teclado el monto de compra 
		//y el día de la semana; si el día es martes o jueves, se realizará un descuento del 15%
		//por la compra. Visualizar el descuento y el total a pagar por la compra.
		
		/*double monto = 0;
		System.out.println("Ingresa el valor de la compra");
		Scanner sc = new Scanner(System.in);
		Scanner leermonto = new Scanner(System.in);
		monto= leermonto.nextDouble();
		
		
		System.out.println("\nIngresa el dia de la semana");
       
		 
        String dia = sc.nextLine(); 
		
		if(dia=="Martes" || dia=="Jueves") {
			System.out.println("El descuesto es de "+ (monto*.15));
			System.out.println("\nEl total de la Compra es "+ (monto - monto*.15));
		}
		else {
			
			System.out.println("No hay descuento en este día :( \n");
			System.out.println("El total de la Compra es "+ (monto- monto*.15));
		}*/
		
		
		// Recibir un texto desde teclado, verificar cuales son vocales y cuales son
				// consonantes
				Scanner sc = new Scanner(System.in);
				String texto = "";
				System.out.println("Ingresa un texto");
				texto = sc.nextLine();
				int num=0;
				//String texto = "hoy es miercoles 10 de noviembre";
//				
//				//Tamaño de un string - .length()
//				System.out.println("Tamaño: "+jj.length());
//				
//				//Pedirle un caracter individual a un string basado en su posicion
//				System.out.println("Caracter: "+jj.charAt(1));

				for (int i = 0; i < texto.length(); i++) {
					System.out.println("Caracter actual: " + texto.charAt(i));

					// Cachar el caracter actual y convertirlo de nuevo a String
					// "m" 'm'
					String aux = Character.toString(texto.charAt(i));
					num=new Integer(aux).intValue();

					//num=Integer.parseInt(aux); 
//					if(aux.equals("a")||
//					   aux.equals("e")||
//					   aux.equals("i")||
//					   aux.equals("o")||
//					   aux.equals("u")) {
//						System.out.println("El caracter actual "+ aux + " si es una vocal");
//					}

					switch (num) {

					case 1:
						System.out.println("El caracter actual "+ num + " Es numero");
						break;
					case 2:
						System.out.println("El caracter actual "+ num + " Es numero");
						break;
					case 3:
						System.out.println("El caracter actual "+ num + " Es numero");
						break;
					case 4:
						System.out.println("El caracter actual "+ num + " Es numero");
						break;
					case 5:
						System.out.println("El caracter actual "+ num + " Es numero");
						break;
					case 6:
						System.out.println("El caracter actual "+ num + " Es numero");
						break;
					case 7:
						System.out.println("El caracter actual "+ num + " Es numero");
						break;
					case 8:
						System.out.println("El caracter actual "+ num + " Es numero");
						break;
					case 9:
						System.out.println("El caracter actual "+ num + "Es numero");
						break;
					case 0:
						System.out.println("El caracter actual "+ num  + " Es numero");
						break;

					}

				}
		
		
		
		
	}
	
	
}
