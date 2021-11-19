package com;

import java.util.Scanner; 

public class Practica_3 {

	public static void main(String[] args) {
		
		// RECIBIR UN TEXTO DESDE TECLADO, VERIFICAR CUALES SON LOS NUMEROS
		
		//Tamaño de un string - .length()
//		System.out.println("Tamaño: "+jj.length());
		
		//Pedirle un caracter individual a un string basado en su posicion
//		System.out.println("Caracter: "+jj.charAt(1));
		
		Scanner sc = new Scanner(System.in);
		String texto = "";

		System.out.println("Ingresa un texto");
		texto = sc.nextLine();

		int valor=0;
		int numeros = 0;
		int suma = 0;
		
		for (int i = 0; i < texto.length(); i++) {
			
			System.out.println("Caracter actual: " + texto.charAt(i));

			String aux = Character.toString(texto.charAt(i));
			
			//Verifico si de verdad ya es un valor numerico, haciendo una operacion aritmetica
			System.out.println(valor+1);
			
			//Manejo del error
			try {
				//Intenta hacer esto ...				
				//Convierte un string a un entero
				valor = Integer.parseInt(aux);
				System.out.println("Si es un numero");
				
				numeros++;
				suma += valor;
				
			}catch(Exception e) {
				//Si no puedes, informa el error
				//e.getMessage();
				System.out.println(aux + " no es un numero");
			}finally {
				//Se ejecutara por default, 
				System.out.println("Accion por default");
			}
			//Comparacion multiple con ifs y operador OR
			if(aux.equals("1")||
			   aux.equals("2")||
			   aux.equals("3")||
			   aux.equals("4")||
			   aux.equals("5")||
			   aux.equals("6")||
			   aux.equals("7")||
			   aux.equals("8")||
			   aux.equals("9")||
			   aux.equals("0")) {
				System.out.println("El caracter actual "+ aux + " si es un numero");
			}
			
			//Comparacion multiple con switch
//			switch (aux) {
//
//			case "a":
//				System.out.println("El caracter actual "+ aux + " si es una vocal");
//				break;
//			case "e":
//				System.out.println("El caracter actual "+ aux + " si es una vocal");
//				break;
//			case "i":
//				System.out.println("El caracter actual "+ aux + " si es una vocal");
//				break;
//			case "o":
//				System.out.println("El caracter actual "+ aux + " si es una vocal");
//				break;
//			case "u":
//				System.out.println("El caracter actual "+ aux + " si es una vocal");
//				break;
//
//			}
			
			//Me impriman la sumatoria de los numeros y cuantos numeros hay en el string
		}	
		
		System.out.println("La suma es: " + suma + " y hay " + numeros + "numeros");
	}
}	