package com;

import java.util.Scanner;

public class Practica_1_Ejercicio2 {
	
	public static void main (String[] args) {
		
	/*	int numero1 = 0, numero2 = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce un numero cualquiera");
		numero2 = entrada.nextInt();
		
		while(numero1 < numero2) {
			
			System.out.println("Este mensaje se imprime " + (numero1 + 1));
			numero1++;
	*/
		
		Scanner entrada = new Scanner(System.in);
		
		String nombre = "";
		int edad = 0;
			
		do {
		System.out.println("Introduce un numero");
		nombre = new Scanner(System.in).nextLine();
		
		System.out.println("Introduce tu edad");
		edad = entrada.nextInt();
		}
		
		while(!(nombre.equals("sebastian") && edad >= 18));
	}	
}
