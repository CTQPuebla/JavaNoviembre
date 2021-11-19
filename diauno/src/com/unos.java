package com;

import java.util.Scanner;

public class unos {
	private static Object sc;

	public static void main(String[] args) {
//		int dia = 2;
//		if(dia == 1 ) {
//			System.out.println("Lunes");
//		}else if(dia==2) {
//			System.out.println("Martes");
//		}else if(dia==3) {
//			System.out.println("Miercoles");
//		}else if(dia==4) {
//			System.out.println("Jueves");
//		}else if(dia==5) {
//			System.out.println("Viervens");
//		}else {
//			System.out.println("Ingresa un valor valido");
//		}
//			

		// Estructura para multiples comprobaciones

//		switch(dia) {
//		case 1:
//			System.out.println("Lunes");
//			break;
//		case 2:
//			System.out.println("Martes");
//			break;
//		case 3:
//			System.out.println("Miercoles");
//		case 4:
//			System.out.println("Jueves");
//			break;
//		case 5:
//			System.out.println("Viernes");
//			break;
//			
//			default:
//				System.out.println("Ingresa un valor valido");
//		}
//		
		///// Trabajo/////
//		int Mes = 5;
//		switch(Mes) {
//			case 1:
//				System.out.println("Enero");
//			break;
//			case 2:
//				System.out.println("Febrero");
//			break;
//			case 3:
//				System.out.println("Marzo");
//			break;
//			case 4:
//				System.out.println("Abril");
//			break;
//			case 5:
//				System.out.println("Mayo");
//			break;
//			case 6:
//				System.out.println("Junio");
//			break;
//			case 7:
//				System.out.println("Julio");
//			break;
//			case 8:
//					
//				System.out.println("Agosto");
//			break;
//			case 9:
//						
//				System.out.println("Septiembre");
//			break;
//			case 10:
//					
//			default:
//				System.out.println("Ingresa un valor valido");		
//		}

		//// TRABAJO /////
//		double salario = 9200.60;
//		
//		if(salario>0 && salario<9000) {
//			System.out.println("Nuevo salario:"+(salario +salario*0.20));
//		}else if(salario>=9001 && salario<=15000) {
//			System.out.println("Nuevo salario:"+(salario +salario*0.10));
//		}else if(salario>15001 && salario<20000) {
//			System.out.println("Nuevo salario:"+(salario +salario*0.5));
//		}else if(salario>15001 && salario<20001) {
//			System.out.println("Nuevo salario:"+(salario +salario*0.3));
//        }
//		
//		// OR, NOT  
//		String K ="hola";
//		int o = 10;
//		if(K.equals("hola") || o ==10) {
//			System.out.println("si se cumple");
//		}else {
//			System.out.println("no se cumple");
//		}
//		
//		///Trabajos////
//		int i = 2;
//		
//		switch (i) {
//		case 0:
//			System.out.println("i es cero");
//			break;
//		case 1:
//			System.out.println("i es uno");
//			break;
//		case 2:
//			System.out.println("i es dos");
//			break;
//		case 3:
//			System.out.println("i es tres");
//			break;
//		case 4:
//			System.out.println("i es cuatro");
//			break;
//		case 5:
//			System.out.println("i es cinco");
//			break;
//		case 6:
//			System.out.println("i es seis");
//			break;
//		default:
//			System.out.println("es mayor a tres");
//		}
//		
//		//// trabajos////
//		int a = 4;
//		int b = 7;
//		String dato = "+";
//		
//		if(dato.equals("+") && a>b)
//		{
//			System.out.println("el resultado es: " + (a));
//		}	
//		
//		if(dato.equals("+")&& b>a)
//		{
//			System.out.println("el resultado es: " + (b));
//		
//		
//		}	
//		
//		////trabajo///
//		
//		int monto=100;
//		String pago = "contado";
//		
//		
//		if(pago.equals("contado")) {
//			
//			System.out.println("el descuento es 5%");
//			System.out.println("Monto a pagar:" + monto*0.95);
//		}else {
//			
//			System.out.println("el cargo es de 3%");
//			System.out.println("Monto a pagar:" + monto*1.03);
//			
//	}
		/*
		 * 
		 * String f = "Marte"; switch(Jueves) { case 1: System.out.println("Lunes");
		 * break; case 2: System.out.println("Marte"); break; case 3:
		 * System.out.println("Miercoles"); break; case 4: System.out.println("Jueves");
		 * break; case 5: System.out.println("Viernes"); break; default:
		 * System.out.println("el descuento es 15%");
		 * System.out.println("Monto a pagar el dia Marte o Juevs:" )(+monto-0.);
		 * 
		 * }
		 */

//		/// trabajos///
//		int n = 10;
//		int contador =0;
//		
//		do{
//			System.out.println("hola al menos una ves");
//			
//		}while(n<10);
//		@SuppressWarnings("resource")
//		Scanner sc = new Scanner(System.in);
//		
//		// entero
//		int numero;
//		System.out.println("Ingresa un numero");
//		numero = sc.nextInt();
//		
//		for(int i1 =1; i1 < 11 ; i1++) {
//			System.out.println(numero + "*" + i1+ " = " + numero*i1);
//			
//		}
//		
//		       Trabajo///
//
//		   convierte a minuscula todo lo que le pases
//
//		String letra = "cEsAR";
//		System.out.println(letra.toLowerCase());
//
//		// Ingresar 10 letras por teclado e imprimir cual de ellas es mayuscula
//
//		Scanner sc = new Scanner(System.in);
//		String texto = "";
//
//		System.out.println("Ingresa un texto");
//		texto = sc.nextLine();
//		String jj = "hoy es miercoles 10 de noviembre";
//
//		// Tamaño de un string - .length()
//		System.out.println("Tamaño: " + jj.length());
//
//		// Pedirle un caracter individual a un string basado en su posicion
//		System.out.println("\nNumero de 1 a1:" + jj.charAt(1));
//
//		for (int i = 0; i < texto.length(); i++) {
//			System.out.println("Caracter actual: " + texto.charAt(i));
//
//			// Cachar el caracter actual y convertirlo de nuevo a String
//			// "m" 'm'
//			String aux = Character.toString(texto.charAt(i));
//
//			if (aux.equals("a") || aux.equals("e") || aux.equals("i") || aux.equals("o") || aux.equals("u")) {
//				System.out.println("El caracter actual " + aux + " si es una vocal");
//			}
//
//			switch (aux) {
//
//			case "a":
//				System.out.println("El caracter actual " + aux + " si es una vocal");
//				break;
//			case "e":
//				System.out.println("El caracter actual " + aux + " si es una vocal");
//				break;
//			case "i":
//				System.out.println("El caracter actual " + aux + " si es una vocal");
//				break;
//			case "o":
//				System.out.println("El caracter actual " + aux + " si es una vocal");
//				break;
//			case "u":
//				System.out.println("El caracter actual " + aux + " si es una vocal");
//				break;
//
//			}
//
//			System.out.println("Ingresa un texto");
//			texto = sc.nextLine();
//
//			String dd = "Juan 120";
//
//			// Tamaño de un string - .length()
//			System.out.println("Tamaño: " + dd.length());
//
//			// Pedirle un caracter individual a un string basado en su posicion
//			System.out.println("Caracter: " + dd.charAt(1));
//
//			int valor = 0;
//
//			for (int i1 = 0; i1 < texto.length(); i1++) {
//				System.out.println("Caracter actual: " + texto.charAt(i1));
//
//				// Cachar el caracter actual y convertirlo de nuevo a String
//				// "m" 'm'
//				String aux1 = Character.toString(texto.charAt(i1));
//
//				// Verifico si de verdad ya es un valor numerico, haciendo una operacion
//				// aritmetica
//				System.out.println(valor + 1);
//
//				// Manejo del error
//				try {
//					// Intenta hacer esto ...
//					// Convierte un string a un entero
//					valor = Integer.parseInt(aux1);
//					System.out.println("Si es un numero");
//				} catch (Exception e) {
//					// Si no puedes, informa el error
//					// e.getMessage();
//					System.out.println(aux1 + " no es un numero");
//				} finally {
//					// Se ejecutara por default,
//					System.out.println("Accion por default");
//				}
//				// Comparacion multiple con ifs y operador OR
//				if (aux.equals("1") || aux.equals("2") || aux.equals("3") || aux.equals("4") || aux.equals("5")
//						|| aux.equals("6") || aux.equals("7") || aux.equals("8") || aux.equals("9")
//						|| aux.equals("0")) {
//					System.out.println("El caracter actual "+ aux + " si es un numero");
		
//	                 }      
		             //   Comparacion multiple con switch
				switch (aux) {

				case "a":
					System.out.println("El caracter actual " + aux + " si es una vocal");
					break;
				case "e":
					System.out.println("El caracter actual " + aux + " si es una vocal");
					break;
				case "i":
					System.out.println("El caracter actual " + aux + " si es una vocal");
					break;
				case "o":
					System.out.println("El caracter actual " + aux + " si es una vocal");
					break;
				case "u":
					System.out.println("El caracter actual " + aux + " si es una vocal");
					break;
//			}

			// Me impriman la sumatoria de los numeros y cuantos numeros hay en el string
			}
				 

     }

}