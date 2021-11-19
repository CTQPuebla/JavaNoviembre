package com;

import java.util.Scanner;

public class PracticaUno {
	public static void main(String[] args) {

		/*
		 * //*System.out.println("8 de noviembre");
		 * //enteros,cadenas,caracteres,decimales
		 * 
		 * String m = "ksisudkndknbdwibi";
		 * 
		 * char c = 'q';
		 * 
		 * boolean f = false;
		 * 
		 * 
		 * double nn = 12.8;
		 * 
		 * int j = 10;
		 * 
		 * System.out.println(m); System.out.println(c); System.out.println(f);
		 * System.out.println(nn); System.out.println(j);
		 * 
		 * if (j == 7 && m.equals("hola")) {
		 * 
		 * System.out.println("se cumple"); }else { System.out.println("no se cumple");
		 * }
		 */
		// if, else, switch-case
		// determinar el dia de la semana

		// int dia = 4;
//		/*if (dia == 1) {
//			System.out.println("lunes");
//		} else if (dia == 2) {
//			System.out.println("martes");
//
//		} else if (dia == 3) {
//			System.out.println("miercoles");
//		} else if (dia == 4) {
//			System.out.println("jueves");
//		} else if (dia == 5) {
//			System.out.println("viernes");
//		} else {
//			System.out.println("Ingrese un valor valido");
//		}*/
//		
//		
//		//estructura para multiples comprobaciones
//		switch (dia) {
//		
//		case 1:
//			//logica
//			System.out.println("lunes");
//			
//			break;	
//			
//		case 2:
//			System.out.println("martes");
//			break;
//			
//		case 3:
//			System.out.println("miercoles");
//			break;
//				
//		case 4:
//			System.out.println("jueves");
//			break;
//			
//		case 5:
//			System.out.println("vienes");
//			break;
//			
//			default:
//				System.out.println("ingresa un valor valido");
//			
//		}

		// salarios ejercicio1

//		double salario = 17098.60;
//
//		if (salario > 0 && salario <= 9000) {
//			System.out.println("Nuevo salio: " + (salario + salario * 0.20)); //primero multiplicacion y luego suma
//		} else if (salario >= 9001 && salario <= 15000) {
//			System.out.println("Nuevo salario: " + (salario + salario * 0.10));
//		} else if (salario >= 15001 && salario <= 20000) {
//			System.out.println("Nuevo salario: " + (salario + salario * 0.05));
//		} else if (salario >= 20001) {
//			System.out.println("Nuevo salario: " + (salario + salario * 0.03));
//		}
		// or, not
		// or
		/*
		 * String k = "hola"; int o = 5; int contador = 0;
		 */
//		if(!(k.equals("hola") && o ==10)) {
//			System.out.println("si se cumple");
//		}else {
//			System.out.println("no se cumple");
//		}
//		//not

//		int num1= 5;
//		int num2=20;
//		
//		if(num1 < num2) {
//			System.out.println("el numero es mayor " + num2);
//		} else {
//			System.out.println("el numero es menor " + num1);
//		}
//
//		
////		// contado y tarjeta
////		String pago = "tarjeta";
////
////		double monto = 100.99;
////		if (pago.equals("contado")) {
////			System.out.println("Monto: " + (monto - (monto * 0.05)));
////			System.out.println("Monto2: " + (monto * 0.95));
////		} else {
////			System.out.println("pago con tarjeta " + (monto + monto * 0.03));
////			System.out.println("pago con tarjeta " + (monto * 1.03));
////		}
//		
//		String diaDesc = "Martes";
//		int pago = 150;
//		
//		
//		if (diaDesc.equals("Martes") || diaDesc.equals("Jueves")) {
//			System.out.println("Pago con descuento es: " + (pago - (pago*0.15)));
//		} else {
//			System.out.println("Pago sin descuento es:" + pago);
//		}

//		while (contador <o) {
//			System.out.println("mensaje" + contador);
//			contador++;
//		}

		// for
//			for (int i = 15; i >=o; i--) {
//				System.out.println("mensaje" + i);
//			}

		// do-while
//		do {
//			System.out.println("hola al menos una vez");
//			o++;
//		}while(o<10);
//	
//		 leer desde teclado
//		Scanner sc = new Scanner(System.in);
//		// enteros
//		System.out.println("Ingresa el numero de veces");
//		int numerodeVeces;
//		numerodeVeces = sc.nextInt();
////		
//		int entero;
//		
//
//		for (int i = 0; i < numerodeVeces ; i++) {
//			System.out.println("Ingresa un numero " +  i);
//			
//			entero = sc.nextInt();
//			System.out.println("Valor actual: "+ entero);
//
//		}
//------------------------------------------------------------------------------------------------------------
//		ingresar 10 letras por teclado e imprimir cual de ellas es mayusculas 
//		Scanner lector = new Scanner(System.in);
//		int p = 10;
//		int cont = 0;
//		String l;
//		
//		
//		while (cont<p) {
//			System.out.println("Ingresa una letra "+ (cont+1));
//			l = lector.nextLine();
//			if (l.equals(l.toUpperCase())) {
//				System.out.println("la letra mayuscula es " + l);
//			}
//			cont++;
//		}
//		System.out.println("Ha terminado");
		
		//otra forma 
		//switch(aux) {
//		case "a":
//			System.out.println("Si es una vocal");
//			break;
//		case "e":
//			System.out.println("Si es una vocal");
//			break;
//		case "i":
//			System.out.println("Si es una vocal");
//			break;
//		case "o":
//			System.out.println("Si es una vocal");
//		case "u":
//			System.out.println("Si es una vocal");
//			break;
//		}
//---------------------------------------------------------------------------------------
		//Recibir un texto desde teclado, verificar cuales son vocales y cuales son consorantes 	
		//Scanner sc = new Scanner (System.in);
		//String texto = ""; //PASAMOS VALOR		
		//System.out.println("Ingrese un texto");	//Instruccion para el usuario
		//texto = sc.nextLine();//metodo que regresa y string y lo guarda en la variable texto	
		//determinar el tamaño del string 
//		System.out.println("Tamaño: " + jj.length());
////		
		//Pedir caracteres individuales segun su posicion 
//		System.out.println("Caracter: " + jj.charAt(1));//charAr() pide un valor entero
//		String aux ="";
//		for (int i=0; i < texto.length(); i++) {
//			aux = Character.toString(texto.charAt(i));
//			if (aux.equals("a")||
//					aux.equals("e")||
//					aux.equals("i")||
//					aux.equals("o")||
//					aux.equals("u")) {
//					
//					System.out.println("El caractec actual es: " + aux + " si es una vocal");
//				} else {
//					System.out.println("El caracter actual es: " + aux  +" no es una vocal");
//				}
//			
		Scanner sc = new Scanner(System.in);
		String txt ="";
		System.out.println("Ingresa numeros");
		txt = sc.nextLine();
		int aux =0;
		for (int i=0; i < txt.length(); i++) {
			aux = Integer.parseInt("txt");
//			if (aux.equals(0)||
//					aux.equals(1)||
//					aux.equals(2)||
//					aux.equals(3)||
//					aux.equals(4)||
//					aux.equals(5)||
//					aux.equals(6)||
//					aux.equals(7)||
//					aux.equals(8)||
//					aux.equals(9)||
//					aux.equals(0)){
					
//					System.out.println("El caractec actual es: " + aux + " si es un numero");
//				} else {
//					System.out.println("El caracter actual es: " + aux  +" no es un numero");
//				}
		
		}
		
		}
}

