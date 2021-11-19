package com;

import java.util.Scanner;

public class Practica_1_Ejercicios {
	
	public static void main (String[] args) {
		
		int numero = 0;	
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Ingresa un numero del 1 al 3");
		numero = entrada.nextInt();
		
		switch(numero) {
			
			case 1:
				System.out.println("El numero es 90");
				break;
			
			case 2: 
				System.out.println("El numero es 40");
				break;
			
			case 3: 
				System.out.println("El numero 50");
				break;
				
			default: 
				System.out.println("Intenta con los numeros del uno al 3");
				break;
		}
		
		entrada.close();
	}
}
